package designpattern.proxypattern.staticproxy;

/**
 * @author TanChengQi
 * @date 2019-12-12 22:24
 * @description 测试类
 */
public class Test {
    public static void main(String[] args) {
        SingerInter sing = new Singer();
        SingerInter singProxy = new SingerProxy(sing);
        singProxy.sing();
    }
}
