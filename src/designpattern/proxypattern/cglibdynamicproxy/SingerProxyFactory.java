package designpattern.proxypattern.cglibdynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author TanChengQi
 * @date 2019-12-13 9:27
 * @description
 */
public class SingerProxyFactory implements MethodInterceptor {
    private Singer singer;
    public SingerProxyFactory(Singer singer){
        this.singer=singer;
    }
    public  Object getSingerProxy(){
        Enhancer enhancer = new Enhancer();
       enhancer.setSuperclass(singer.getClass());
       enhancer.setCallback(this);
      return   enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("大家好");
        Object returnValue= method.invoke(singer,objects);
        System.out.println("谢谢");
        return returnValue;
    }
}
