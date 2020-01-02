package designpattern.factorypattern.factorymethod;

/**
 * @author TanChengQi
 * @date 2019-12-14 19:07
 * @description 泛型抽象工厂
 */
public interface IFactoryBase2 {
    <T extends Car> T productCar(Class<T> car);
}
