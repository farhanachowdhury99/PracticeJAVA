package abstraction;

public class Toyota implements Car {

    String name="BMW";
    String carModel="RAV4";
    String modelYear="2018";
    public static void main(String[] args) {
    Toyota toyota=new Toyota();
    toyota.startCar();
    toyota.stopCar();
    toyota.breakCar();
    toyota.steeringCar();


    }

    public void startCar() {
        System.out.println("Toyota car has start button");
    }

    public void stopCar() {
        System.out.println("Toyota car has stop button");
    }

    public void breakCar() {
        System.out.println("Toyota car has break feature");
    }

    public void steeringCar() {
        System.out.println("Toyota car has steering feature");
    }
}
