package designpattern.singlepattern;

/**
 * @author TanChengQi
 * @date 2019-12-12 20:06
 * @description 懒加载单例模式   缺点：线程不安全 优点：延时加载
 */
public class LazySingle {
    private LazySingle(){};
    private static LazySingle lazySingle = null;

    public static LazySingle  getLazySingle(){
        if(lazySingle==null){
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }
}
