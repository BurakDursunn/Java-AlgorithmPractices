import java.util.ArrayList;
import java.util.List;

public class ListContainsOdd {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(7);
        System.out.println(isContainsOdd(list));
        System.out.println(isContainsOddStream(list));
    }

    public static boolean isContainsOdd(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean isContainsOddStream(List<Integer> list) {
        return list.stream().anyMatch(n -> n % 2 != 0);
    }
}
