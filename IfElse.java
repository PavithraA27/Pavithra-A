import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int unit;
        System.out.println("Enter units");
        unit = sc.nextInt();

        if (unit <= 150) {
            System.out.println("Bill " + (unit * 1.5));

        } else {
            System.out.println("Bill  " + (unit * 3));
        }

    }
}
