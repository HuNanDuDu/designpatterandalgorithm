package designpattern.factorypattern.abstractfactory;

/**
 * @author TanChengQi
 * @date 2019-12-14 20:19
 * @description
 */
public class BmCar implements  Car {
    @Override
    public void carType() {
        System.out.println("我是宝马汽车");
    }
}
