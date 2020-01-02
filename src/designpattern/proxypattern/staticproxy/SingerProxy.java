package designpattern.proxypattern.staticproxy;

/**
 * @author TanChengQi
 * @date 2019-12-12 22:18
 * @description 歌手代理类
 */
public class SingerProxy implements SingerInter {
    private SingerInter singer;
    public  SingerProxy(SingerInter singer){
        this.singer = singer;
    }
    @Override
    public void sing() {
        System.out.println("大家好");
        singer.sing();
        System.out.println("谢谢");
    }


}
