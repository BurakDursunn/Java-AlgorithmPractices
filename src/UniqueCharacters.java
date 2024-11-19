import java.util.HashSet;

public class UniqueCharacters {
    public static String findUniqueCharacters(String str) {
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) uniqueChars.add(c);

        return uniqueChars.toString();
    }

    public static void main(String[] args) {
        System.out.println(findUniqueCharacters("burakdursun"));
    }
}
