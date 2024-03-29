# 内容说明

- 本人IT培训机构Java技术教师。
- 当前仓库中包含多个项目，这些项目中的示例代码用于演示MyBatis框架的使用，如果想要进行参考那么请按照工程文件夹名称中1、2、3、4（顺眼）的顺序进行。
- 项目中使用了MySQL数据库，创建数据库的语句在每个项目中db文件夹下，不同项目中数据库结构会有所不同，每次执行程序之前请先执行对应项目中的数据库初始化脚本。
- 每个项目中同样会有readme.md文件用于对当前项目的内容进行更加细节的说明。

### 项目说明

MyBatisDemo1

> 项目搭建，主要留意配置文件的信息。
>
> 在这个项目展示了固定增删改查语句的执行。

MyBatisDemo2

> 在上一个项目的基础上，我们封装了一个工具类以规避写重复的获取SqlSession的代码，但是请注意，这个阶段的工具类封装并不健全。
>
> 此外我们不可能每次都执行固定的SQL，在实际开发中SQL中的数据内容我们需要加以匹配处理，当前项目中主要展示了如何向SQL语句中传入参数值。

MyBatisDemo3

> 这个项目中主要展示了对于各种查询语句结果集的处理方式。
>
> 需要注意的点和使用方式在每一个Demo类和Mapper.xml文件中以注释的形式加以说明。

MyBatisDemo4

> MyBatis中针对于一些特殊查询的处理
>
> 需要注意的事项都在Mapper.xml以注释的形式说明。

MyBatisDemo5

> 执行数据添加的时候获得自增主键值。

MyBatisDemo6

> 这个项目中专门体现了如果处理数据库表字段名和程序实体类字段名称不一致的问题。

MyBatisDemo7

> 多对一关系的配置方式、一对多关系的配置方式、联合查询、分步查询、延迟加载

MyBatisDemo8

> 动态SQL的使用展示

MyBatisDemo9

> MyBatis一二级缓存

MyBatis10

> 使用PageHelper实现分页