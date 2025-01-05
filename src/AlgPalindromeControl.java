public class AlgPalindromeControl {

    // return boolean, input string, write method, one arg, public method
    // test case: level -> true      ahmet -> false     null -> false

    public static void main(String[] args) {

       String input="level";
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String str){
        if(str==null){
            return false;
        }
        for(int i=0; i<str.length()/2; i++){

            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
