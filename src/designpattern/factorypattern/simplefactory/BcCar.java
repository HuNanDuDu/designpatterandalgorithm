package designpattern.factorypattern.simplefactory;

/**
 * @author TanChengQi
 * @date 2019-12-13 21:58
 * @description 奔驰类
 */
public class BcCar implements  Car {
    @Override
    public void carType() {
        System.out.println("奔驰");
    }
}
