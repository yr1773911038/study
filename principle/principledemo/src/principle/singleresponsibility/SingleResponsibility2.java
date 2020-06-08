package principle.singleresponsibility;

/**
 * 1、遵守了单一职责原则
 * 2、但是这样改动很大，即类分解，同时需要修改客户端
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehich roadVehich = new RoadVehich();
        roadVehich.run("汽车");
        roadVehich.run("摩托车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

class RoadVehich{
    public void run(String vehicle){
        System.out.println(vehicle+"公路运行");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"天空运行");
    }
}
