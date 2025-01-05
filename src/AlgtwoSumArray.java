import java.util.Arrays;

public class AlgtwoSumArray {

    // return indexes (array), return int array, parameters are int array and int number, method public, array can not be null,
    // no restriction about target, must find the target(sum of two number)

    // test cases: {2,7,11,15} : 9   ->  2+7=9 --> return 0,1
    // test cases: {2,7,11,15} : 5   ->  no numbers --> return empty int array



    public static void main(String[] args) {

        int[] array = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(array,9)));
    }

    public static int[] twoSum(int[] arr, int target){

        int[] indexes = new int[2];

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){

                if(arr[i]+arr[j]==target){
                    indexes[0]=i;
                    indexes[1]=j;
                }
            }
        }
        return indexes;
    }

}
