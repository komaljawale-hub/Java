public class DiagonalSum {
    public static void main(String[] args) {
        System.out.println("Welcome to Digonal elements sum");
        int[][] array2D = ArrayUtility.input2DArray();
        long sum = sumOfDiagonals(array2D);
        System.out.println("sum of diagonals is : " + sum);
    }
    public static long sumOfDiagonals(int[][] array2D){
        long leftSum = sumOfLeftDiagonal(array2D);
        long rightSum = sumOfRightDiagonal(array2D);
        long sum = leftSum + rightSum; //here adding both
        if(array2D.length % 2 != 0){ //in odd no. of rows and columns middle elemnt can be repeated for left and right addn so minus one time in such case handling
            int ind = array2D.length / 2; //check if odd then length by 2 gives middle elemnt
            sum = sum - array2D[ind][ind]; // that element index no minus from sum
        }
        return sum;

    }
    public static long sumOfLeftDiagonal(int[][] array2D){
        long sum = 0;
        int i = 0;
        while (i < array2D.length){
            sum = sum + array2D[i][i]; //first we calculate left diagonal sum in which index num is always same so just give that condition
            i++;
        }
        return sum;

    }
    public static long sumOfRightDiagonal(int[][] array2D){
        long sum = 0;
        int i = 0;
        while(i < array2D.length){ // here for right one digonal indexs are like 0,2  1,1  2,0 means for first length -1 for 1 length -2 like this
            int colm = array2D.length - 1 - i; //this condition like reversing and checkimg fore increasing indexes from front minus the length from last
            sum = sum + array2D[i][colm]; // get sum og 1st index and in second that column number
            i++;
        }
        return sum;

    }



}
