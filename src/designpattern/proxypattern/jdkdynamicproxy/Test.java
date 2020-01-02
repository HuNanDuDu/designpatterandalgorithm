package designpattern.proxypattern.jdkdynamicproxy;

/**
 * @author TanChengQi
 * @date 2019-12-12 23:11
 * @description
 */
public class Test {
    public static void main(String[] args) {
        SingerInter singProxy = SingerProxyFactory.getSingerProxy();
        System.out.println(singProxy.getClass().getName());
        singProxy.sing("我很快乐");
    }
}
