package abstraction;

public interface Car {

    public String name="car";
    public int price=25000;
    String seat="2";
    boolean gasTank=true;

    public void startCar();
    public void stopCar();
    public void breakCar();
    public void steeringCar();

    public static int carDoor(int doornumber){
        int total=doornumber;
        System.out.println("Total door "+total);
        return total;
    }


}
