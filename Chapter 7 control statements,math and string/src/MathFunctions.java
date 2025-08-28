public class MathFunctions {
    public static void main(String[] args) {
        System.out.println(Math.abs(-245));
        System.out.println(Math.ceil(5.00245));
        System.out.println(Math.floor(5.00345));
        System.out.println(Math.round(5.078) + " + " + Math.round(5.56));
        System.out.println(Math.random());   //it always gives random values between 0.0 to 1.0


        for (int i = 0; i < 10 ; i++) {
//            System.out.println(Math.random());   // it will give 10 random values between 0.0 to 1.0
            System.out.println("Now we want random numbers between 1 to 100");
            long random = (int) Math.round(Math.random() * 100);
            // random function by default store in long but here we type cast and store in int
            // And also not to get 0 result we will round it off with math.round()
            System.out.println(random);

        }
    }
}
