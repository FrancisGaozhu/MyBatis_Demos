# 一对多、多对一的做法

- 前提：MyBatis核心配置文件中已经开启了懒加载模式。
- 该项目中gaozhu.francis.util.SqlSessionUtils工具类编写更加趋近完善。
- 在当前项目中，账户和帖子之间时多对一关联，帖子和账户之间时多对一关联，我将这两种关系放在了同一个项目中是为了一起展示呈现。当然在实际开发工作中不会出现这种情况。

1. 使用连接查询在同一个resultMap中进行结果解析的方式实现的多对一查询：gaozhu.francis.demo.Demo1
1. 使用连接查询在resultMap中利用association元素解析多对一结果集：gaozhu.francis.demo.Demo2
1. 使用分步查询的方式实现的多对一查询：gaozhu.francis.demo.Demo3
1. 仅获取帖子信息不获取账户信息的时候不会查询账户信息，这是对于懒加载模式的一个测试，开启打印Sql语句的配置能通过是否执行了对应的SQL来发现这一点：gaozhu.francis.demo.Demo4
1. 通过连接查询的方式实现的一对多查询：gaozhu.francis.demo.Demo5
1. 分步查询的方式实现的一对多查询：gaozhu.francis.demo.Demo6