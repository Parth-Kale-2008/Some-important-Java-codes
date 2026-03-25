import java.util.*;
public class LoveCalc{
    public static void main(String[] args){
        System.out.println("Greetings Folks !");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name1 = sc.nextLine();

        System.out.println("enter your crush's name: ");
        String name2 = sc.nextLine();

        int love = (int)(Math.random()*101);

        System.out.println("your love % is: "+love);
    }
}