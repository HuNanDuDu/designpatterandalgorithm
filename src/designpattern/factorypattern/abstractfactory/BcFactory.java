package designpattern.factorypattern.abstractfactory;

/**
 * @author TanChengQi
 * @date 2019-12-14 21:26
 * @description
 */
public class BcFactory implements  IFactoryBase {
    @Override
    public Car productCar() {
        return new BcCar();
    }

    @Override
    public Motor productMotor() {
        return new BcMotor();
    }
}
