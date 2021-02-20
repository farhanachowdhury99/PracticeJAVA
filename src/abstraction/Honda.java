package abstraction;

public class Honda extends modernCar implements Car {


    public void hondaCarInfo(){

        System.out.println("Honda car info");
    }
    @Override
    public void startCar() {
        System.out.println("Toyota car has start button");
    }

    @Override
    public void stopCar() {
        System.out.println("Toyota car has stop button");
    }

    @Override
    public void breakCar() {
        System.out.println("Toyota car has break button");
    }

    @Override
    public void steeringCar() {
        System.out.println("Toyota car has sttering button");
    }

    public void cameras() {
        System.out.println("Modern car hAS CAMERAS");
    }

    public void backCamera() {
        System.out.println("Modern car hAS BACK CAMERAS");
    }

    public void autoStart() {
        System.out.println("Modern car hAS auto start");
    }

    public void autoParking() {
        System.out.println("Modern car hAS auto parking");
    }

    public void emergencyBrake() {
        System.out.println("Modern car hAS emeergency brake ");
    }
}
