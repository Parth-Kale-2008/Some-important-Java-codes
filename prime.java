import java.util.Scanner;

public class prime {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<= n/2;i++){
            if(n % i ==0 ){
            return false;
            } 
        }

        return true;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int num = sc.nextInt();

    if(isprime(num)){
        System.out.println(num+" number is prime");
    }else{
        System.out.println(num+" number is composite");
    }
    sc.close();
    }
}
