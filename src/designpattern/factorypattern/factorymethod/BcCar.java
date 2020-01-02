package designpattern.factorypattern.factorymethod;

/**
 * @author TanChengQi
 * @date 2019-12-14 17:26
 * @description
 */
public class BcCar implements  Car {
    @Override
    public void carType() {
        System.out.println("我是奔驰");
    }
}
