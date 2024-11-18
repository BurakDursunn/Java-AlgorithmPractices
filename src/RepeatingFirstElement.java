import java.util.HashSet;

public class RepeatingFirstElement {
    public static int findFirstRepeating(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1; // returns -1 if there is no repeating element
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 3, 4, 5, 2, 3, 1};
        System.out.println(findFirstRepeating(arr)); // Output: 5
    }
}
