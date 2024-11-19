public class ReverseWords {
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("backend development with java spring boot"));

    }
}
