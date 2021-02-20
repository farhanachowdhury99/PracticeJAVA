package inheritance;

public class TestPerson {

    public static void main(String[] args) {

        Teacher T1= new Teacher();
        T1.name= "ALisha";
        T1.age= 22;
        T1.Qualifications= "Masters";

        T1.displayInfo2();

        Teacher t2=new Teacher();
        t2.name="Farhana";
        t2.age=22;
        t2.Qualifications="MSC";
        t2.displayInfo();
    }
}
