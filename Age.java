import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        double salary;
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        System.out.println("Enter your salary:");
        salary = sc.nextDouble();
        if (age >= 21 && salary >= 21000) {
            System.out.println("Eligible for loan " + name);

        } else {
            System.out.println("Not eligible for loan  " + name);
        }
    }

}
