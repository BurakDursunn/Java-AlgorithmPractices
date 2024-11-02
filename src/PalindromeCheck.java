public class PalindromeCheck {

    public static void main(String[] args) {

        String string = "abccba";
        String string2 = new StringBuilder(string).reverse().toString();

        boolean b = string.equals(string2);

        System.out.println(b);
    }
}
