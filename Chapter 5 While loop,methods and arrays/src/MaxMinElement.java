public class MaxMinElement {
    public static void main(String[] args) {
        System.out.println("Welcome to maximum and minimum of an array\n");
        int[] arr = ArrayUtility.inputArray();
        if(arr.length == 0){
            System.out.println("We cannot find the maximum and minimum ");
            return;
        }
        int min = min(arr);
        System.out.println("Minimum number from your array is: " + min);
        int max = max(arr);
        System.out.println("Maxixmum number from your array is: " + max);
    }
    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < arr.length){
            if(min > arr[i]){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
    public static int max(int[] arr){
        int i = 0;
//        int max = Integer.MAX_VALUE;    ....this gives minimum value in case arr length is 0
        // but i have already checked in main method if arr.length == 0 then return
        int max = arr[0];
        while (i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;

    }
}
