package ClassImpl;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Ortadaki elemanı hesapla

            // Hedef öğe bulundu
            if (arr[mid] == target) {
                return mid;
            }

            // Hedef öğe ortadakinin sağında
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // Hedef öğe ortadakinin solunda
            else {
                right = mid - 1;
            }
        }

        // Öğeyi bulamadıysak -1 döndür
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
