import java.util.HashSet;

public class UnionIntersection {
    public static HashSet<Integer> union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) set.add(num);
        for (int num : arr2) set.add(num);
        return set;
    }

    public static HashSet<Integer> intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        for (int num : arr1) set1.add(num);
        for (int num : arr2) if (set1.contains(num)) intersection.add(num);
        return intersection;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        System.out.println("Union: " + union(arr1, arr2)); // Output: [1, 2, 3, 4, 5, 6]
        System.out.println("Intersection: " + intersection(arr1, arr2)); // Output: [3, 4]
    }
}
