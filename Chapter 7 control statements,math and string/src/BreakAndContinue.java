public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("before loop");
//        for (int i = 0; i < 10000; i++){
//            if(i == 101){
//                break;
//            }
//            System.out.println(i);
//        }

        for(int i =1; i <= 10; i++){
            if( i == 6 || i == 9){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of the loop");

    }
}
