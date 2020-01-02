package designpattern.proxypattern.staticproxy;

/**
 * @author TanChengQi
 * @date 2019-12-12 22:13
 * @description 歌手实现类
 */
public class Singer implements SingerInter {
    @Override
    public void sing() {
        System.out.println("我唱歌了:我很快乐");
    }
}
