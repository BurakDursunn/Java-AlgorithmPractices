import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 2, 3, 7, 8, 1};
        findDuplicates(numbers);

        char[] letters = {'a', 'b', 'c', 'd', 'a', 'e', 'b'};
        findDuplicates(letters);

        System.out.println("-------------------");

        int[] numbers2 = {20,30,20,15};
        findDuplicatesLoop(numbers2);

        char[] letters2 = {'x', 'y', 'a', 'x'};
        findDuplicatesLoop(letters2);
    }

    public static void findDuplicates(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate number: " + entry.getKey());
            }
        }
    }

    public static void findDuplicates(char[] arr) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char letter : arr) {
            countMap.put(letter, countMap.getOrDefault(letter, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate letter: " + entry.getKey());
            }
        }
    }

    public static void findDuplicatesLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate number: " + arr[i]);
                    break;
                }
            }
        }
    }

    public static void findDuplicatesLoop(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate letter: " + arr[i]);
                    break;
                }
            }
        }
    }
}

