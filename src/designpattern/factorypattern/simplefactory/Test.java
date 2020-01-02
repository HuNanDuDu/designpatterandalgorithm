package designpattern.factorypattern.simplefactory;

/**
 * @author TanChengQi
 * @date 2019-12-13 22:10
 * @description 测试类
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Car car = CarFactory.getCar("11");
        car.carType();
    }
}
