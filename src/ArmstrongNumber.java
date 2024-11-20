public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return sum == originalNum;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // Output: true
        System.out.println(isArmstrong(123)); // Output: false

        for (int i = 1; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
