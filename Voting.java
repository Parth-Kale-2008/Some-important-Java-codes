import java.util.HashMap;
import java.util.Scanner;

class Election{
    String name;
    long voter_id;
    long Aadhar_no;
    int value;

    Election(String name,long voter_id,long Aadhar_no,int value){
        this.name = name;
        this.voter_id = voter_id;
        this.Aadhar_no = Aadhar_no;
        this.value = value;
    }
}

public class Voting{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name of user: ");
        String s1 = sc.nextLine();

        System.out.print("Enter voter id: ");
        long s2 = sc.nextLong();

        System.out.print("Enter Aadhar number: ");
        long s3 = sc.nextLong();

        String user_name = "Parth123";
        String password = "12345";

        if(user_name.equals("Parth123") && password.equals("12345")){
            System.out.println("Authencation successful");
        }else{
            System.out.println("Authencation failed");
        }

        System.out.println("choose your party:-");
        System.out.println("1.BJP");
        System.out.println("2.Congress");
        System.out.println("3.Tmc");
        System.out.println("4.Ncp");

        int choice = sc.nextInt();
        String partyName = "";

        switch(choice){
            case 1:
            partyName = "BJP";
            break;

            case 2:
            partyName = "Congress";
            break;

            case 3:
            partyName = "Tmc";
            break;

            case 4:
            partyName = "Ncp";
            break;

            default:
            System.out.println("Invalid choice");
            return;
        }

        System.out.println("your vote has been successfully casted to "+partyName);
        
    }
}
