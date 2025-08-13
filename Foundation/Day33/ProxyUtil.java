package Day33;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    // 这个类的作用 是创建一个代理

    // 这个方法的作用
    // 创建一共代理
    // 形参：被代理的明星对象
    // 返回值：给明星创建代理

    public static Star createProxy(BigStar bigStar) {
        /*
         * java.lang.reflect.Proxy类
         * public static Object newProxyInstance(Class Loader, Class<?>[]
         * interfacesInvocationHandler h)
         * 参数一：用于指定那个类加载器，去加载生成的代理类
         * 参数二：指定接口，这些接口用于指定生成代理长什么样
         * 参数三：用来指定代理对象要做的事情
         */

        Star star = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[] { Star.class },
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 参数一 代理的对象 star
                        // 参数二 要运行的方法
                        // 调用sing方法时 传递实参
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒,收钱");

                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地,收钱");
                        }
                        // 去找大明星开始唱歌或是跳舞
                        // 代码表现形式 调用大明星里面的唱歌或是跳舞的方法
                        return method.invoke(bigStar, args);
                    }
                });
        return star;
    }
}
 