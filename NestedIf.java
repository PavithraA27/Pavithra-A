import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age");
        age = sc.nextInt();

        if (age >= 18) {
            if (age >= 65) {
                System.out.println("Eligible for senior citizen ship and vote");

            } else {
                System.out.println(" eligible to vote but not for senior citizen ship");
            }
        } 
        else {
            System.out.println("Not eligible to vote");
        }
    }

}
