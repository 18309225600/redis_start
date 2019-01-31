# redis_start
redis demo以及相关架构设计知识

主从-》哨兵-》集群

代码： 详见demo
#==================================
Springboot 2.x以后redis配置可以忽略
    详细配置参照RedisConfig.class

在具体的业务中需要缓存，则加上对应的注解即可
类上面的注解：@CacheConfig(cacheNames = "users")
方法上面的注解：@Cacheable(key ="#p0")
#==================================

redis主从配置：
    修改配置文件中的 slaveof

redis中的持久化：
    rdb:保存数据快照（默认方式）
    aof：保存操作指令（默认开启的是每秒一次，应该开启always，每执行一个操作则记录一个指令）

    日志位置 dir:   默认是     ./  也就是当前配置文件目录

redis数据类型：
    String，hash，list ，set，zset

redis中的事物（一般不用）：
    multi（开启事物）
    exec （提交事物）
    discard （回滚事物）

redis中的指令：
    info    查看redis信息
    config get *   查看所有配置
    rename key key1  重命名key
    expire key 2 设置key2秒后过期
    persist key 设置key不过期
    ttl key 查看key的过期时间
    select 1 选择到db1
    move key 2 将key移动到db2中去
