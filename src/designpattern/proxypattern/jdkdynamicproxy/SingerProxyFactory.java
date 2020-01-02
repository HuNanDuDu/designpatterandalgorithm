package designpattern.proxypattern.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author TanChengQi
 * @date 2019-12-12 22:46
 * @description
 */
public class SingerProxyFactory {
    public static SingerInter getSingerProxy(){
    SingerInter singer =  new Singer();
    Object singProxy = Proxy.newProxyInstance(singer.getClass().getClassLoader(), singer.getClass().getInterfaces(), new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("大家好");
            Object object = method.invoke(singer,args);
            System.out.println("谢谢");
            return object;
        }
    });
    return (SingerInter) singProxy;
    }
}
