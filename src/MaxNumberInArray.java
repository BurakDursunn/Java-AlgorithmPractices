public class MaxNumberInArray {

    public static void main(String[] args) {

        int[] arr = {3,0,10,20,5,25};
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max number in array: " + max);
    }
}
