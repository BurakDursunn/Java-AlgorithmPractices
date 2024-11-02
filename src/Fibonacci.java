import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.print("Enter a number for fibonacci: ");
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        int a = 0;
        int b = 1;

        if (user < 0) {
            System.out.println("Number can not be less than 0 !");
        }
        if (user == 0) {
            System.out.println(a);
        }
        else if (user == 1) {
            System.out.println(b);
        }
        else{
            int c=0;
            for(int i=2; i<=user; i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
    }
}
