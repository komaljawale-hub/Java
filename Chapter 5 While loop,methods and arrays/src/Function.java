public class Function {
    public static void main(String[] args) {
//        System.out.println("In main method");
//        greetUser();
//        System.out.println("Method calling / invocation completed");

        FirstPattern();
//        SecondPattern();
//        ThirdPattern();
    }
    public static void FirstPattern(){
        int rows = 0;
        while (rows < 5){
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
        }
        System.out.println();
        rows++;
    }

//    public static void SecondPattern(){
//        System.out.println("         *");
//        System.out.println("       * *");
//        System.out.println("     * * *");
//        System.out.println("   * * * *");
//        System.out.println(" * * * * * \n");
//
//    }
//
//    public static void ThirdPattern(){
//        System.out.println("* * * * *");
//        System.out.println("* * * *");
//        System.out.println("* * *");
//        System.out.println("* *");
//        System.out.println("*");
//    }
//
//    public static void greetUser(){
//        System.out.println("Good morning, Have a good day");
    }
}
