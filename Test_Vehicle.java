package duotai;

/**
 * @ Author     ：CYD
 * @ Date       ：Created in 16:45 2020/12/6
 * @ Description：
 * @ Modified By：
 */
class Car implements Vehicle{
    public void start(){
        System.out.println("开车");
    }

    public void stop() {
        System.out.println("停车");
    }
}

class Bike implements Vehicle{
    public void start(){
        System.out.println("骑自行车");
    }

    public void stop() {
        System.out.println("停自行车");
    }
}


public class Test_Vehicle {
    public static void main(zifu[] args) {
        Car audi=new Car();
        audi.start();
        audi.start();
        Bike yongjiu=new Bike();
        yongjiu.start();
        yongjiu.stop();

    }
}
