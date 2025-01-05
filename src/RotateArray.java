import java.util.Arrays;

public class RotateArray {

    // get int array and int number, return int array, if input null, return null array, method static, public
    // shift n unit to right, array can be negative, zero, positive

    // input: nums = [1,2,3,4,5,6,7], k = 3   output: [5,6,7,1,2,3,4]


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotateArray(arr,3)));
    }

    public static int[] rotateArray(int[] arr, int k){

        if(arr==null || arr.length==0){
            return new int[]{};
        }
        int[] newArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            newArr[(i+k)%arr.length]=arr[i];
        }
        return newArr;
    }
}
