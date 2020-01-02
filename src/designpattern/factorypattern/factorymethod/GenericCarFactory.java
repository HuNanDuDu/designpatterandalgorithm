package designpattern.factorypattern.factorymethod;

/**
 * @author TanChengQi
 * @date 2019-12-14 19:20
 * @description
 */
public class GenericCarFactory implements IFactoryBase2 {
    private Car car;
    @Override
    public <T extends Car> T productCar(Class<T> carClass) {
        try {
            car = (Car) Class.forName(carClass.getName()).newInstance();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return (T)car;
    }
}
