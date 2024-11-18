public class PalindromeCheckNumber {

    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }
}
