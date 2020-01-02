package designpattern.proxypattern.jdkdynamicproxy;

/**
 * @author TanChengQi
 * @date 2019-12-12 22:43
 * @description
 */
public class Singer  implements SingerInter {
    @Override
    public void sing(String aaa) {
        System.out.println("我唱歌了："+aaa);
    }
}
