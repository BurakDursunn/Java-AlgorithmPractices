import java.util.HashSet;
import java.util.Set;

public class MissingNumberArray {

    // return int, get int array to parameters, if array contains
    // same numbers return 0,  if array null, return 0, public method, static

    // test cases:       input: [3, 7, 1, 2, 8, 4, 5]  output: 6           input: [1,2,3,3,5] output: 0
    //                   input: []  -> 0

    public static void main(String[] args) {

        int[] arr = {3, 7, 1, 2, 8, 4, 5};
        System.out.println(missingNumberArray(arr));
    }

    public static int missingNumberArray(int[] arr){

        if(arr==null || arr.length==0){
            return 0;
        }
        Set<Integer> integerSet = new HashSet<>();

        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
            integerSet.add(arr[i]);
        }
        if(integerSet.size()!=arr.length){
            return 0;
        }
        int missingNumber=((arr.length+2)*(arr.length+1)/2)-sum;

        return missingNumber;
    }
}
