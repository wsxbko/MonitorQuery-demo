package com.yonyou.ucf.mdf.app.application.res;


import com.yonyou.ucf.mdf.app.application.dto.NhSourceBillDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NhSourceBillResult {

    /**
     * 用户传入的分页数据
     */
    // 页面大小
    private int pageSize;
    // 当前页
    private int currentPage;

    /**
     * 返回的计算/查询结果
     */
    //数据总条数
    private int totalCount;

    //查询结果集
    private List<NhSourceBillDto> NhSourceBillDTODataList;

    /**
     * 程序的计算
     */
    private int prevPage;       // 上一页
    private int nextPage;       // 下一页
    private int totalPage;      // 总页数


    //在impl里面通过 Request入参，把参数提取出来，然后进行一个mybatis的查询，返回结果集，然后最后生成result，返回给前端
    public NhSourceBillResult(int pageSize, int currentPage, int totalCount, List<NhSourceBillDto> nhSourceBillDTODataList) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.totalCount = totalCount;
        NhSourceBillDTODataList = nhSourceBillDTODataList;

        this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        this.prevPage = Math.max(currentPage - 1, 1);
        this.nextPage = Math.min(currentPage + 1, totalPage);
    }
}
