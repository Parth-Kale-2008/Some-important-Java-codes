import java.util.*;

public class leap_yr {

    public static void isLeapYear(int year){

        boolean isLeapYr = false;

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            isLeapYr = true;
        }else{
            isLeapYr = false;
        }

        if(isLeapYr){
            System.out.println(year + " is a Leap Year");
        }else{
            System.out.println(year + " is not a Leap Year");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        isLeapYear(year);

        sc.close();
    }
}