package designpattern.factorypattern.factorymethod;

/**
 * @author TanChengQi
 * @date 2019-12-14 17:33
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Car bmCar = new BmFactory().productCar();
        bmCar.carType();

        Car bcCar = new GenericCarFactory().productCar(BcCar.class);
        bcCar.carType();
    }
}
