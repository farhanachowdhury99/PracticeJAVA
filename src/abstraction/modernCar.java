package abstraction;

public abstract class modernCar {

    String modernCarName="Audi";
    double modernCarPrice=75000;

    public abstract void cameras();
    public abstract void backCamera();
    public abstract void autoStart();
    public abstract void autoParking();
    public abstract void emergencyBrake();

    public static void remoteStart(){
        System.out.println("Modern car has remote start engine");
    }

    public void fourWheel(){
        System.out.println("Modern car has 4 wheel");
    }





}
