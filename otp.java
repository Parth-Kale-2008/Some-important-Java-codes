import java.util.Random;
class otp{
    public static void main(String[] args){
        Random random = new Random();
        String otp = "";
        for(int i=0;i<4;i++){
            int digit = random.nextInt(10);
            otp += digit;
        }
        System.out.println("your otp is: "+otp);
    }
}