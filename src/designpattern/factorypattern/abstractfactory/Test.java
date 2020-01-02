package designpattern.factorypattern.abstractfactory;

/**
 * @author TanChengQi
 * @date 2019-12-14 21:27
 * @description
 */
public class Test {
    public static void main(String[] args) {
        IFactoryBase   bcFactory = new BcFactory();
         Car bcCar = bcFactory.productCar();
         bcCar.carType();
    }
}
