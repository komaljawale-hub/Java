public class TwoDimentionalArray {
    public static void main(String[] args) {

        //method 1
        int[][] arr = {{1,2,3} , {4,7,2} , {7,4,6}};
        System.out.println(arr.length);
        //method2
        int[][] myArr = new int[3][2];
        myArr[0][0] = 45;

        //Traversal
        int i = 0;
        while (i < arr.length){   //this loop is for outer rows printing
            int j = 0;
            while (j < arr[i].length){  // this loop for columns printing till row length
                System.out.print(arr[i][j] + " ");
                j++;

            }
            System.out.println();

            i++;
        }
    }
}
