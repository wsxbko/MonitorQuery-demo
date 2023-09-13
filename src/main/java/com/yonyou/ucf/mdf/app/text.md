### mybatis整合数据库的连接和查询
#### 1、配置文件pom.xml:mysql、jdbc、mybatis、springboot
Spring Boot提供了一些 “Starter”，让你把 jar 添加到你的classpath。“Starter” 提供了你在开发特定类型的应用程序时可能需要的依赖

#### 2、配置文件mybatis-config.xml:XML 配置文件中包含了对 MyBatis 系统的核心设置，包括获取数据库连接实例的数据源（DataSource）以及决定事务作用域和控制方式的事务管理器（TransactionManager）
在使用 Spring Boot 和 Maven 整合 MyBatis 时，你可以在项目中选择是否使用 MyBatis 的配置文件。

如果你不需要自定义太多 MyBatis 的配置，可以省略 MyBatis 的配置文件，因为 Spring Boot 提供了自动配置的特性，会为你自动完成 MyBatis 的配置。在这种情况下，你只需要在 application.properties 或 application.yml 中添加相应的数据库连接信息，Spring Boot 将会根据这些配置自动创建并管理数据源，并且将 MyBatis 集成到应用程序中。

然而，如果你需要对 MyBatis 进行更详细的配置，例如配置类型别名、插件、拦截器等，可以创建一个 mybatis-config.xml 文件，并将其放在 resources 目录下。在配置文件中，你可以定义数据源、事务管理器、映射器等，以及其他高级配置。这样，MyBatis 将根据你提供的配置文件进行自定义配置。

请注意，如果你选择使用自定义的 MyBatis 配置文件，你需要确保在 Spring Boot 的配置文件（例如 application.properties 或 application.yml）中添加以下配置项，告诉 Spring Boot 使用该配置文件：

yaml

mybatis.config-location=classpath:mybatis-config.xml

以上配置将告诉 Spring Boot 寻找项目中名为 mybatis-config.xml 的配置文件，并加载它。\

两种方式
配置文件里url：jdbc:mysql://127.0.0.1:3306/#{数据库名称}?useUnicode=true&&serverTimezone=Asia/Shanghai
application.yml里对mybatis的配置有一个：

**type-aliases-package**
作用：MyBatis引用的实体类自定义别名，避免使用又长又臭的完全限定名。
解释：https://www.cnblogs.com/east7/p/16701983.html

资源路径：
classpath: 是一个用于指定资源路径的前缀
是的，classpath: 代表了 src/main/resources/ 这个路径。在 Spring Boot 中，src/main/resources/ 目录下的资源文件会被打包到项目的类路径中。

使用 classpath: 前缀可以方便地引用位于类路径下的资源文件。例如，如果有一个名为 example.txt 的文本文件位于 src/main/resources/ 目录下，你可以通过 classpath:example.txt 来引用它。


### 接受来自http的请求
@RequestMapping 注解提供了 “routing” （路由）信息。 它告诉Spring，任何带有 / 路径的HTTP请求都应该被映射到 home 方法
@RestController 注解告诉Spring将返回的结果字符串直接响应给客户端

org.mybatis.spring.MyBatisSystemException: 
nested exception is org.apache.ibatis.reflection.ReflectionException:
Could not set property 'entitycode' of 'class com.yonyou.ucf.mdf.app.application.dto.NhSourceBillDto' 
with value 'yz_rtyuhgfds' Cause: org.apache.ibatis.reflection.ReflectionException: 
There is no setter for property named 'entitycode' in 'class com.yonyou.ucf.mdf.app.application.dto.NhSourceBillDto'