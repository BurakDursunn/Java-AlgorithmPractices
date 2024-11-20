public class ToggleCase {
    public static String toggleCase(String str) {
        StringBuilder toggledString = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(c); // Space or non-alphabetical characters remain the same
            }
        }
        return toggledString.toString();
    }

    public static void main(String[] args) {
        System.out.println(toggleCase("Hello World!")); // Output: "hELLO wORLD!"
    }
}
