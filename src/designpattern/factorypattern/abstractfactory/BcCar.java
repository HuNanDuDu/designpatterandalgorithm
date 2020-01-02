package designpattern.factorypattern.abstractfactory;

/**
 * @author TanChengQi
 * @date 2019-12-14 20:20
 * @description
 */
public class BcCar implements Car {
    @Override
    public void carType() {
        System.out.println("我是奔驰汽车");
    }
}
