package designpattern.factorypattern.abstractfactory;

/**
 * @author TanChengQi
 * @date 2019-12-14 21:00
 * @description 抽象工厂接口
 */
public interface IFactoryBase {
    /**
     * 生产汽车
     * @return
     */
    Car productCar();

    /**
     * 生产摩托
     * @return
     */
    Motor productMotor();
}
