package designpattern.factorypattern.abstractfactory;

/**
 * @author TanChengQi
 * @date 2019-12-14 21:25
 * @description 宝马工厂
 */
public class BmFactory implements  IFactoryBase{
    @Override
    public Car productCar() {
        return new BmCar();
    }

    @Override
    public Motor productMotor() {
        return new BmMotor();
    }
}
