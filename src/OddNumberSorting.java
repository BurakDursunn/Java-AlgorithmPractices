import java.util.Arrays;

public class OddNumberSorting {

    // return int array, get int array, if array null empty array, if array has no odd number sort the even numbers.
    // test cases:    1,2,3,4,5 -> 1,3,5,2,4         2,6,4 -> 2,4,6     1,5,3 -> 1,3,5


    public static void main(String[] args) {

        int[] trying = {5,4,3,2,1};
        System.out.println(Arrays.toString(arraySortOdd(trying)));
    }

    public static int[] arraySortOdd(int[] arr){

        if(arr==null){
            return new int[]{};
        }
        int oddCount=0;
        int evenCount=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==1){
                oddCount++;
            }
            else{
                evenCount++;
            }
        }
        int[] oddArr = new int[oddCount];
        int[] evenArr = new int[evenCount];

        oddCount=0;
        evenCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==1){
                oddArr[oddCount]=arr[i];
                oddCount++;
            }
            else{
                evenArr[evenCount]=arr[i];
                evenCount++;
            }
        }
        Arrays.sort(oddArr);
        Arrays.sort(evenArr);
        int[] concated = new int[oddCount+evenCount];

        for(int i=0; i<oddCount; i++){
            concated[i]=oddArr[i];
        }

        for(int i=oddCount; i<oddCount+evenCount; i++){
            concated[i]=evenArr[i-oddCount];
        }
        return concated;
    }
}
