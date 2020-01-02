package designpattern.singlepattern;

/**
 * @author TanChengQi
 * @date 2019-12-12 21:13
 * @description //双重检查模式  优点:线程安全 不会产生垃圾对象 第一次判断是为了多个线程同时被阻塞;第二次是为了
 * 防止对象重复创建
 */
public class SynchronizedSingle {
    private SynchronizedSingle(){}
    private static volatile  SynchronizedSingle  synchronizedSingle= null;

    public static SynchronizedSingle getSynchronizedSingle(){
        if(synchronizedSingle==null){
            synchronized (SynchronizedSingle.class){
                if(synchronizedSingle==null){
                    synchronizedSingle = new SynchronizedSingle();
                }
            }
        }
        return  synchronizedSingle;
    }
}