### 集合查询语句
SELECT entitycode,period,batch_no,COUNT(*) as `sendCount`
FROM nh_source_bill
GROUP BY entitycode,batch_no;

### 建表语句
CREATE TABLE `nh_source_bill` (
`id` VARCHAR(100) NOT NULL,
`entitycode` VARCHAR(50) NOT NULL,
`batch_no` VARCHAR(50) NOT NULL,
`datasource` VARCHAR(50) NOT NULL,
`srcsystemcode` VARCHAR(50) NOT NULL,
`srctablename` VARCHAR(50) NOT NULL,
`action` VARCHAR(10) NOT NULL,
`period` VARCHAR(10) NOT NULL,
`src_data_msg` TEXT
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

### xml里面的查询语句，存储新值count
<select id="queryData" resultMap="EntityCountResultMap">
  SELECT entitycode, period, batch_no, COUNT(*) as `sendCount`
  FROM nh_source_bill
  GROUP BY entitycode, batch_no;
</select>

<resultMap id="EntityCountResultMap" type="NhSourceBillVO">
  <result property="entitycode" column="entitycode"/>
  <result property="period" column="period"/>
  <result property="batch_no" column="batch_no"/>
  <result property="count" column="sendCount"/>
</resultMap>

### 分页
```sql
SELECT * FROM product LIMIT (currentPage - 1) * pageSize, pageSize ;
```
0,5 -> 相当于 1 - 5条记录
### 分页需展示的数据的来源
#### ①参数（来源于用户传入）
  currentPage： 当前页，int 类型
  pageSize： 每页显示多少条数据，int 类型

#### 展示的数据
**· 来源于两条 SQL 查询：**
totalCount/rows： 数据总条数，int 类型
```sql
SELECT COUNT(*) FROM 表名 [WHERE 条件];

```
data/list： 每一页的结果集数据，List 类型
```sql
SELECT * FROM 表名 [WHERE 条件] LIMIT ?, ? ;
```
**· 来源于程序计算：**
totalPage： 总页数/末页，int 类型
prevPage： 上一页，int 类型
nextPage： 下一页，int 类型
```sql
int totalPage = rows % pageSize == 0 ? rows / pageSize : rows / pageSize + 1; // 优先计算 
int prevPage = currentPage - 1 >= 1 ? currentPage - 1 : 1; 
int nextPage = currentPage + 1 <= totalPage ? currentPage + 1 : totalPage;

```
### 添加新的表字段 sysTime
```sql
ALTER TABLE nh_source_bill ADD COLUMN sysTime DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP;

```

### SELECT测试：
```sql
SELECT src_name AS srcName, entitycode AS entityCode,batch_no
FROM nh_source_bill
WHERE src_name = 'default_src_name';


SELECT src_name AS srcName, entitycode AS entityCode,batch_no
FROM nh_source_bill
WHERE src_name = 'yz数据中台'

SELECT src_name AS srcName, entitycode AS entityCode, period, batch_no, COUNT(*) AS sendCount, MIN(sysTime) AS sysTime
FROM nh_source_bill
WHERE period = '2023-08'
GROUP BY entitycode, batch_no
LIMIT 100 OFFSET 0

```
