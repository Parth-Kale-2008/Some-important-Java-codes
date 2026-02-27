import java.util.*;
public class Linkedlist{
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<>();
        cars.add("bmw x5");
        cars.add("maserati");
        cars.add("porche 911");
        cars.add("alto");
        
        cars.remove(1);
        System.out.println(cars);

    }
}