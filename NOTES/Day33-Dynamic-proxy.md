# 动态代理 Dynamic-proxy

---

## 1.什么是动态代理
1. 为什么需要代理
   代理可以无嵌入式的给对象增强其他功能
   调用者 -> 代理 -> 对象

2. 代理长什么样
   代理里面就是对象被代理的方法

3. java通过什么来保证被代理的方法
   通过接口保证，后面对象和代理需要实现同一共接口
   接口中就是被代理的所有方法 

---



## 2.如何为JAVA对象创建一共代理对象 
4. java.lang.reflect.Proxy类
   public static Object newProxyInstance(Class Loader, Class<?>[] interfaces, InvocationHandler h)
   参数一：用于指定那个类加载器，去加载生成的代理类
   参数二：指定接口，这些接口用于指定生成代理长什么样
   参数三：用来指定代理对象要做的事情


---








