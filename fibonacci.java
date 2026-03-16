import java.util.*;

public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms :");

        int n = sc.nextInt();

        if(n<=0){
            System.out.println("enter the number:");
        }else if(n==1){
            System.out.println("fibonacci series upto "+n+" terms is :");
        }else{
            System.out.println("fibonacci series upto"+n+" terms is :");
            long a = 0;
            long b = 1;
            System.out.println(a+" "+b);
            for(int i=2;i<n;i++){
                long c = a+b;
                System.out.println(" "+c);
                a=b;
                b=c;
            }
            System.out.println();
        }
        sc.close();
    }
}