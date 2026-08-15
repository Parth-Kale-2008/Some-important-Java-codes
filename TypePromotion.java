public class TypePromotion {
    public static void main(String[] args) {
        char c = 'A';
        byte b = 5;
        short a = 3;

        byte bt = (byte)(a + b + c);

        System.out.println(bt);
    }
}