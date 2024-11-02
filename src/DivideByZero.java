import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        try {
            System.out.println(input/ 0);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Error: division by zero");
        }
    }
}