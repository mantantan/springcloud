# springcloud common包
### 该包中只存放视图层返回的entity和接口声明
##### 原因：
- entity可以供其他rest调用方公用，该包可以直接以jar包的形式供第三方依赖
- 接口声明也是如此，如果有需要引入了RPC，第三方系统可以直接引入我们这个jar包作为RPC接口
