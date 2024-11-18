public class SumOfNumbersInString {
    public static int sumOfNumbers(String str) {
        int sum = 0;
        String temp = "0";
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }

   
}

