import java.util.Arrays;

public class ReverseEvenNumbers {
    public static void reverseEvenNumbers(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 0 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else {
                if (arr[left] % 2 != 0) left++;
                if (arr[right] % 2 != 0) right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 10, 1};
        reverseEvenNumbers(arr);
        System.out.println(Arrays.toString(arr));
    }
}
