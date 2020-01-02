package designpattern.factorypattern.simplefactory;

/**
 * @author TanChengQi
 * @date 2019-12-13 21:51
 * @description  汽车工厂
 */
public class CarFactory {

  public static  Car getCar(String type) throws Exception {
       if("BM".equals(type)){
           return new BmCar();
       }else if("BC".equals(type)){
           return new BcCar();
       }else{
           throw new Exception("该工厂不拥有你输入的型号汽车");
       }
  }
}
