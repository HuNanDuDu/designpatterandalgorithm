package designpattern.factorypattern.abstractfactory;

/**
 * @author TanChengQi
 * @date 2019-12-14 20:21
 * @description
 */
public class BcMotor implements  Motor {
    @Override
    public void motorType() {
        System.out.println("我是奔驰摩托");
    }
}
