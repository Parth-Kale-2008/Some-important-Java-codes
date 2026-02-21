import java.util.Scanner;

public class lcm {
    static int abc (int a,int b){
        int g = Math.max(a,b);
        int h = Math.min(a,b);

        for(int i=g;i<= a*b;i+=g){
            return i;
        }
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number:");
        int a = sc.nextInt();

        System.out.println("enter the 2nd number:");
        int b = sc.nextInt();

        System.out.println("the lcm is:"+abc(a,b));
    }
}
