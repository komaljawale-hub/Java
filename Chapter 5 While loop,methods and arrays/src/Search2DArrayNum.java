import java.util.Scanner;

public class Search2DArrayNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to searching in 2D array");
        int[][] new2D = ArrayUtility.input2DArray();
        System.out.print("Now , enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(new2D , num);
        if(isFound){
            System.out.println("Your element is present");
        }else {
            System.out.println("Your element is not present");
        }
    }
    public static boolean isFound(int[][] new2D , int num){
        int i = 0;
        int index = 0;
        while (i < new2D.length){
            int j = 0;
            while (j < new2D[i].length){
                if (new2D[i][j] == num){
                    return true;

                }
                j++;
            }
            i++;
        }
        return false;
    }
}
