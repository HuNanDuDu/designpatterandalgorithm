package designpattern.factorypattern.abstractfactory;

/**
 * @author TanChengQi
 * @date 2019-12-14 20:21
 * @description
 */
public class BmMotor implements  Motor {
    @Override
    public void motorType() {
        System.out.println("我是宝马摩托");
    }
}
