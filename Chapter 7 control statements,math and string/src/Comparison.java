public class Comparison {
    public static void main(String[] args) {
        int a = 30, b = 50, c = 20;

        // code to find greater number using if ladder         --------------------------

        if (a > b){
            if (a > c) {
                System.out.println("a is greater");
            }else {
                System.out.println("c is greater");
            }
        }else {
            System.out.println("b is greater");
        }


        // code to find smaller number using else if        ----------------

        if (a < b && a < c){
            System.out.println("a is lesser");

        } else if (b < a && b < c) {
            System.out.println("b is lesser");

        }else {
            System.out.println("c is lesser");
        }


    }
}
