public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 24;
//        myArr[4] = 56;        its one method to input elements in an array
//        myArr[2] = 2;
//        myArr[3] = 100;
//        myArr[1] = 67;

        int[] myArr = {23 ,34 ,34, 78 , 45};   // its second method to put elements in an array when you already know the elements

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);     //manual way to print index number values from array
//        System.out.println(myArr[4]);
//
         // Array traversal
        int index = 0;
        while(index < 5){                    //here we can write index < myArr.length  if array size is unknown
            System.out.println(myArr[index]);
            index++;                                       // using loop we can print  the values from an array
        }

        String[] strArr = new String[4];
        strArr[0] = "My name is Komal";
        System.out.println(strArr[0]);

        String[] newStrArr = {"first" , "second" ,"third"};
        System.out.println(newStrArr.length);










    }
}
