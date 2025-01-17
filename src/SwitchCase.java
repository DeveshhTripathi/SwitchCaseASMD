import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Choose 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division:");
        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Result of addition is: " + (a + b));
                break;
            case 2:
                System.out.println("Result of subtraction is: " + (a - b));
                break;
            case 3:
                System.out.println("Result of multiplication is: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result of division is: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Please choose a number between 1 and 4.");
        }
        sc.close();
    }
}
