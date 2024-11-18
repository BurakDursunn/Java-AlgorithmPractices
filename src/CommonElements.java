import java.util.HashSet;

public class CommonElements {
    public static void findCommonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        System.out.print("Common elements: ");
        for (int num : arr2) {
            if (set1.contains(num)) {
                System.out.print(num + " ");
                set1.remove(num); // Aynı elemanı tekrar yazdırmamak için kaldır
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 11, 13, 44};
        int[] arr2 = {3, 4, 5, 6, 7, 13, 0, 44};
        findCommonElements(arr1, arr2);
    }
}
