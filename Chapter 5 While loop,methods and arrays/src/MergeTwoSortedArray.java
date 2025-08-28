public class MergeTwoSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Merging sorted arrays\n ");
        int [] arr1 = ArrayUtility.inputArray();
        int [] arr2 = ArrayUtility.inputArray();
        int[] mergedarray = merge(arr1 , arr2);
        System.out.println("Your merged array is: ");
        ArrayUtility.displayArray(mergedarray);
    }

    public static int[] merge(int[]arr1 , int[]arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0 , j = 0 , k = 0;
        while(i < arr1.length || i < arr2.length){
            if(j == arr2.length ||
                    (i < arr1.length && arr1[i] < arr2[j])){
                // here we are checking if arr2's index is equal to j means it cant go to else part
                // just stay in if condn and print 1st array but at the same time by && condn
                // arr1.length > i if its not true it will go to else part to print arr2 elements

                newArr[k] = arr1[i];
                i++;
                k++;
            // in each case new array pointer that is k will increase but here while printing arr1 element i will ++
            // in else case k++ as it is and arr2 element is printing so its j pointer will ++
            }else{
                newArr[k] = arr2[j];
                k++;
                j++;
            }
        }



        return newArr;
    }

}
