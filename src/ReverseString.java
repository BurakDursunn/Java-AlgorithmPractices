public class ReverseString {

    public static void main(String[] args) {

        String s = "Java Developer";
        String s2 = new StringBuilder(s).reverse().toString();

        System.out.println(s);
        System.out.println(s2);

    }
}
