package arraylist;

import java.util.LinkedList;

public class LearnLinkedList {

   LinkedList<String> stAddress= new LinkedList<>();
    LinkedList <String> pizzaName= new LinkedList<>();


   public static void main(String[] args) {


      LearnLinkedList learn = new LearnLinkedList();
      learn.stAddress.add("Michigan");
      learn.stAddress.add("New York");
      learn.stAddress.add("LOuisian");
      learn.stAddress.add("Mississippi");
      learn.stAddress.add("Maine");

      System.out.println(learn.stAddress.get(4));

      for (String add: learn.stAddress){
         System.out.println("Student address is "+add);
      }

learn.pizzaInfo();
   }

   public void pizzaInfo(){
      pizzaName.add("Cheese pizza");
      pizzaName.add("Chicken pizza");
      pizzaName.add("Onion pizza");
      pizzaName.add("Jalapino pizza");

      System.out.println(pizzaName.get(2));

      for (String st: pizzaName){
         System.out.println("Pizza name: "+st);
      }
   }

}
