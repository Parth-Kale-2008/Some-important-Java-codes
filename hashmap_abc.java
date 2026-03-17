import java.util.*;
public class hashmap_abc {
    public static void main(String[] args){
        HashMap <String,String> abc = new HashMap<>();
    abc.put("bmw","car");
    abc.put("audi","car");
    abc.put("Pune","city");

    abc.put("ferrari","car");
    abc.remove("audi");

    System.out.println(abc);
    
    }
}
