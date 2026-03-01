import java.util.*;

class calculator{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number :");
    int a = sc.nextInt();

    System.out.println("enter the second number :");
    int b = sc.nextInt();

    System.out.println("enter the operation :");
    char operation = sc.next().charAt(0);

    double result = 0;

    switch(operation){
        case '+': result = a+b;
        break;

        case '-': result = a-b;
        break;

        case '*': result = a*b;
        break;

        case '/': result = a/b;
        break;

        default: System.out.println("invalid operation");
    }
        System.out.println("the result is : "+ result);
        sc.close();
    }
}
