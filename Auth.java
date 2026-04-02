public class Auth{
    public static void main(String[] args){
        String user_name = "Thor123";
        String password = "12345";

        if(user_name.equals("Thor123") && password.equals("12345")){
            System.out.println("Authencation successful");
        }else{
            System.out.println("Authencation failed");
        }
    }
}