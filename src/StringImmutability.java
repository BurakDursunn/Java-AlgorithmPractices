public class StringImmutability {
    public static void main(String[] args) {
        String s1="burak";
        String s2=s1;

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);

        s1="kamil";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);

    }
}
