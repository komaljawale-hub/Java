import java.util.Scanner;

public class OccuranceOfNum {
    public static void main(String[] args) {
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
        System.out.print("\nEnter a number to be check : ");
        int find = input.nextInt();
        System.out.println(find + " is occur " + checkOcc(arr,find) + " times");
    }

    public static int checkOcc(int[] arr, int find) {
        int occ = 0;
        for (int num : arr){
            if (num == find){
                occ++;
            }
        }
        return occ;
    }
}
