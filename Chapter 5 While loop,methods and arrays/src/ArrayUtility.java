import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        return arr;
    }

    public static void displayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static void display2DArray(int[][] numArray) {
        int i = 0;
        int j = 0;
        while (i < numArray.length) {
            while (j < numArray[i].length){
                System.out.print(numArray[i][j] + " ");
                j++;
            }
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = input.nextInt();
        int[][] arr = new int[rows][columns];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.print("Please enter element of row "
                        + (i + 1) + " and " + "column " + (j + 1) + " :");
                arr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }

        return arr;
    }
}