public class SumAndAvg2DArray {
    public static void main(String[] args) {

        System.out.println("welcome to sum and average calculator\n");
        int[][] arr = ArrayUtility.input2DArray();
        int sum = Sum(arr);
        double avg = Average(arr);
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);

    }
    public static int Sum(int[][] arr){
        int i = 0;
        int sum = 0;
        while (i < arr.length){
            int j = 0;
            while (j < arr[i].length){
                sum = sum + arr[i][j];
                j++;
            }
            i++;

        }
        return sum;
    }
    public static double Average(int[][] arr){
        if(arr.length == 0){
            return 0;
        }
        int rows = arr.length;  // array length gives number of rows
        int cols = arr[0].length;  // it gives number of columns in first row assuming homogeneous array of same no of columns in each row

        double average = 0;
        double size = rows * cols;  // cals separately to get final multi in double instead of int or long
        // calculates total number of elements in an array so that total no can be divided by sum
        average = Sum(arr) / size;

        return average;
    }





}
