public class Recurssion{
    public static void printNum(int n){
        if(n==0){
            System.out.println("0");
            return ;
        }
        System.out.println(n);
        printNum(n-1);
    }

    public static void main(String[] args){
        int n = 10;
        printNum(n);
    }
}