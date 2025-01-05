public class ContainsVowels {

    public static void main(String[] args) {

        String s1="New Mexico";
        System.out.println(containsVowels(s1));
    }

    public static boolean containsVowels(String s){
        return s.toLowerCase().matches(".*[aeiou].*");
    }
}
