## redis数据类型

[官方对于数据类型的文档](https://redis.io/topics/data-types)

### 1、Strings 字符串

最基本也最常用的数据类型，二进制安全

#### 存储类型

可以用来存储整数、浮点数、字符串。

#### 操作命令

| 命令  | 作用                                      | 示例             |
| ----- | ----------------------------------------- | ---------------- |
| set   | 设置键值对                                | set key value    |
| mset  | 设置多个键值对                            | mset k1 v1 k2 v2 |
| setnx | 如果key存在，则设置不成功，可用作分布式锁 | setnx k1 v1      |
| incr  |                                           |                  |
|       |                                           |                  |
|       |                                           |                  |
|       |                                           |                  |
|       |                                           |                  |
|       |                                           |                  |



#### 存储实现原理

##### 数据模型

##### redisObject

##### 内部编码

#### 应用场景



### 2、Lists 列表



### 3、Sets 集合



### 4、Hashes 哈希

```
包含键值的无序散列表，value只能是字符串，不能嵌套其他类型
```



#### 存储类型

#### 操作命令

#### 存储实现原理

##### zipList

##### hashtable(dict)



###### ###### 

### 5、Sorted sets



#### 6、Bitmaps and HyperLogLogs







