import java.util.HashSet;

public class SmallestMissingPositive {
    public static int findMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int missing = 1;
        while (set.contains(missing)) {
            missing++;
        }
        return missing;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1,2};
        System.out.println(findMissingPositive(nums)); // Output: 2
    }
}
