public class DigitalRoot {
    public static int findDigitalRoot(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(findDigitalRoot(456)); // Output: 6
        System.out.println(findDigitalRoot(444)); // Output: 6
    }
}
