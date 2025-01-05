public class CapitalizeWords {
    public static void main(String[] args) {
        String sentence = "hello world! java programming.";
        System.out.println(capitalizeWords(sentence));

        String sentence2 = "turkey is consist of 81 city";

        System.out.println(capitalizeWordsWithASCII(sentence2));

    }

    public static String capitalizeWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return capitalizedSentence.toString().trim();
    }

    public static String capitalizeWordsWithASCII(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstChar = word.charAt(0);
                if (firstChar >= 'a' && firstChar <= 'z') {
                    firstChar = (char) (firstChar - ('a' - 'A'));
                }
                capitalizedSentence.append(firstChar).append(word.substring(1)).append(" ");
            }
        }
        return capitalizedSentence.toString().trim();
    }
}

