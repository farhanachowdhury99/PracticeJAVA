package abstraction;

public class Test {
    public static void main(String[] args) {
        Toyota toyota= new Toyota();
        toyota.stopCar();
        toyota.startCar();
        toyota.stopCar();
        Car.carDoor(2);


        System.out.println(toyota.name);
    }

}
