public class StringSubsetCheck {

    // metin = "hellojavaspring"          substrings = {"hello", "spring", "java"}     false

    public static void main(String[] args) {
        String text="hellojavainterview";
        String[] substrings = {"hello", "java", "interview"};
        System.out.println(stringSubsetCheck(text,substrings));
    }

    public static boolean stringSubsetCheck(String str, String[] strArray){

        if(str==null || strArray==null){
            return false;
        }
        String stringConcated = "";

        for(int i=0; i<strArray.length; i++){
            stringConcated=stringConcated+strArray[i];
        }
        return stringConcated.equals(str);
    }
}
