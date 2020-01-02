package designpattern.factorypattern.simplefactory;

/**
 * @author TanChengQi
 * @date 2019-12-13 21:58
 * @description 宝马类
 */
public class BmCar implements  Car {
    @Override
    public void carType() {
        System.out.println("宝马");
    }
}
