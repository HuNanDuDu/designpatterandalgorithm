package designpattern.factorypattern.factorymethod;

/**
 * @author TanChengQi
 * @date 2019-12-14 17:27
 * @description
 */
public class BmCar implements Car {
    @Override
    public void carType() {
        System.out.println("我是宝马");
    }
}
