package designpattern.factorypattern.factorymethod;

/**
 * @author TanChengQi
 * @date 2019-12-14 17:31
 * @description
 */
public class BmFactory implements IFactoryBase {
    @Override
    public Car productCar() {
        return  new BmCar();
    }
}
