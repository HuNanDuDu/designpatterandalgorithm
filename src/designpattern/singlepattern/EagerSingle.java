package designpattern.singlepattern;

/**
 * @author TanChengQi
 * @date 2019-12-12 20:38
 * @description 饿汉模式  优点：线程安全 缺点：(发生在类装载的初始化阶段) 容易产生垃圾
 * 类装载分为三个过程 加载  链接(校验 准备 解析)  初始化
 */
public class EagerSingle {
 private EagerSingle(){};
 private static EagerSingle eagerSingle = new EagerSingle();

 public static EagerSingle getEagerSingle(){
     return eagerSingle;
 }

}
