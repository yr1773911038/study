package principle.singleresponsibility;

/**
 * 1、这种修改方法没有对原来的类做很大的改动，只是增加了方法
 * 2、这里虽然没有在类级别上遵守单一职责原则，但是在方法级别上，仍然遵守单一职责
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle1 vehicle1 = new Vehicle1();
        vehicle1.run("汽车");
        vehicle1.runAir("飞机");
    }
}
class Vehicle1{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上运行");
    }

    public void runAir(String vehicle){
        System.out.println(vehicle+"在天空上运行");
    }
}
