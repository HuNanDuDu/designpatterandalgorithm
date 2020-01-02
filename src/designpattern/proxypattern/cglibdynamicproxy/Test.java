package designpattern.proxypattern.cglibdynamicproxy;

/**
 * @author TanChengQi
 * @date 2019-12-13 9:27
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Singer singerProxy = (Singer) new SingerProxyFactory(new Singer()).getSingerProxy();
        System.out.println(singerProxy.getClass().getName());
        singerProxy.sing();
    }
}
