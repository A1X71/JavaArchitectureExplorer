* 项目分层
    * controller: servlet作为controller
    * model
    * service
    * util
* 日志处理
* 数据库读取
* 单元测试
* 辅助类
    * 文件读取
    * 类型转换
    * 基本的判断封装
* 项目优化
    * 从service中抽取数据库操作公用操作(如配置文件读取、打开连接、关闭连接)
    * 通过Apache Common项目中的DbUtils类库（此库提供了JDBC的封装），解决sql语句与实体映射的过程
    * 将“连接数据库，关闭数据库”抽像到公共类中
        * 利用ThreadLocal存放本地线程变量，确保一个线程中只有一个Connection, 将ThreadLocal作一个线程隔离的容器，避免Connection出现线程安全问题。