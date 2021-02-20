package learninheritance;

public class Test {
    public static void main(String[] args) {

        Car newCar= new Car();
        hondaCivic hondacivic= new hondaCivic();
        hondacivic.releaseYear="2018";
        hondacivic.engine="Auto enginee";
        hondacivic.carBrand="Honda";
        hondacivic.door="4";
        hondacivic.seat="4";



        hondacivic.myHonda();
        hondacivic.myCar();

    }
}
