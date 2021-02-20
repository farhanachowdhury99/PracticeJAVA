package quiz;

import abstraction.Car;
import abstraction.Toyota;
import learninheritance.hondaCivic;

public class Test {
    public static void main(String[] args) {
        hondaCivic hc= new hondaCivic();
        Car myCar= new Toyota();
        ((Toyota) myCar).steeringCar();



    }
}
