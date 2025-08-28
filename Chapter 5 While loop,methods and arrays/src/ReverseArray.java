public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Here we are reversing an array\n");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Here is the reversed array: ");
        reverse(arr);
        ArrayUtility.displayArray(arr);

    }
    public static void reverse(int[] arr){
        int i = 0;
        while (i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1 - i)];
            // Above lines logic is that in swap variable is store current ith position element
            // at the same time ith posn filled with its mirror index last element
            // as for 0 [(5 - 1) - 0] means at oth posn 5th index num replaces
            // that -i is for mirror index from end
            arr[(arr.length - 1) - i]  = swap;
            i++;
        }
    }















//    public static int reversing(int[] arr){
//        int i = 0;
//        int reverse = 0;
//        while(i < arr.length){
//            reverse = arr.length - 1;
//
//            i--;
//        }
//        return reverse;
//
//    }
}
