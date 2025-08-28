public class Parameter {
    public static void main(String[] args) {
      /*  int num = addition(3,5);   This line can be reduced if we call the method
      inside the print function itself
       */
        System.out.println(addition(4 ,4));
        System.out.println(addition(667,2));
        System.out.println(addition(-78 ,89));
        System.out.println(addition(0 ,23  ));


    }
    public static int addition(int a,int b){
        System.out.println("First number received: "+ a);
        System.out.println("Second number received: " + b);
        //int sum = a+b;
        /* return sum;  we can directly take return as a + b dont need to take sum a extra variable */
        return a+b;

    }
}
