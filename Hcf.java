public class Hcf{
    static int num(int a,int b){
        if(b==0)
        return a;
    
        return num(b,a%b);

    }
    public static void main(String[] args){
        System.out.println(num(48,18));
    }
}