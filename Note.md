#### 笔记1:
生产者和消费者用的接口全限定名必须相同，全限定名不一致则无法成功调用方法


#### 笔记2：
如项目中所示，有三种使用的方式
1. 完全通过xml整合到spring中使用, 并且通过xml配置暴露和调用服务
2. 完全使用dubbo的api调用，不与spring发生关联
3. 使用注解整合spring, 并通过注解暴露和调用服务

#### 笔记3：
dubbo默认会自动读取classpath: dubbo.properties配置文件(如果存在), 
并且优先级比xml配置文件高, 也即: 如果同一个配置在两个配置文件中都存在，
会优先dubbo.properties

#### 笔记4：
用main方法启动的工程，要想dubbo能正常暴露服务或者消费服务，main方法一定不能退出，得让main方法一直等待
synchronized (E.class) {
	while (true) {
		try {
			E.class.wait();
		} catch (Throwable e) {

		}
	}
}

#### 笔记5：
注解方式和xml配置方式可以混用，不过整合方式还是推荐选其中一种，服务暴露和消费方式可以混用