public class isSorted {
    public static void main(String[] args) {

        System.out.println("Welcome to array sorting checkpost");
        int[] array = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(array);
        boolean isDec = isDecreasing(array);
        if(isInc || isDec){   //if is any condition will be true
            //  then it will return array is sorted if any false then not sorted
            System.out.println("Your array is sorted ");
        }else {
            System.out.println("Your array is not sorted");
        }
    }
    public static boolean isIncreasing(int[] array){
        int i = 1;
        while (i < array.length){
            if (array[i] < array[i-1]){  // if increasing means previous no. should be small than ith posn num
                // but check ulta for convinience to return false
                return false;
            }
            i++;
        }
      return true;

    }
    public static boolean isDecreasing(int[] array){
        int i = 1;
        while (i < array.length){
            if(array[i] > array[i-1]){     // if decreasing means previous no. should be greater than ith posn num
                // but check ulta for convinience to return false
                return false;
            }
            i++;
        }
        return true;
    }

}
