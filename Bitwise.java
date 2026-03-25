public class Bitwise {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println("And: " + (a & b));
        System.out.println("Or: " + (a | b));
        System.out.println("XOR:" + (a ^ b));
        System.out.println("NOT :" + (~b));// (b=0010-(b+1))
    }
}
 