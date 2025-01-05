public class ReverString {

    public static void main(String[] args) {

        String s1 = "abcde123a";
        reverseString(s1);
    }

    public static void reverseString(String str){

        char[] ch = str.toCharArray();

        int start=0;
        int end=str.length()-1;

        while(start<end){

            char temp = ch[start];
            ch[start]=ch[end];
            ch[end]=temp;

            start++;
            end--;
        }
        System.out.println(ch);
    }
}
