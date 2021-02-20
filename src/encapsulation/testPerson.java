package encapsulation;

public class testPerson {
    public static void main(String[] args) {
        person person1= new person();
        person1.setName("Farhana");
        System.out.println(person1.getName());

        person1.setAge(28);
        System.out.println(person1.getAge());

        person1.setAddress("Michigan");
        System.out.println(person1.getAddress());
    }
}
