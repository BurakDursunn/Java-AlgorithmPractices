package ClassImpl;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Dizi boyutunu kadar tekrarla
        for (int i = 0; i < n - 1; i++) {
            // Her geçişte büyük elemanları sona doğru itir
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Elemanları takas yaparak yer değiştir
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

