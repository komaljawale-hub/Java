public class StringFormat {
    public static void main(String[] args) {
        String name = "Seeta";
        int marks = 9256;
        System.out.println("Hello " + name + ", your marks are: " + marks);

        System.out.printf("Hello %-10S , your marks are: %,09d " , name, marks);    //this is efficient way,because you can give
        // arguments inside string itself using some notations with % sign
    }
}
