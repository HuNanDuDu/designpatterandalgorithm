package designpattern.factorypattern.factorymethod;

/**
 * @author TanChengQi
 * @date 2019-12-14 17:28
 * @description 奔驰工厂
 */
public class BcFactory implements IFactoryBase {
    @Override
    public Car productCar() {
        return new BcCar();
    }
}
