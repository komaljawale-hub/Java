public class Book {
        static int totalBooks;
        String title;
        String author;
        int isbn;
        boolean isBorrowed;

        static {
            totalBooks = 0;

        }
        {  //Object init
        totalBooks++;
        }

        Book(int isbn , String title , String author){
            this.isbn = isbn;
            this.title = title;
            this.author = author;

        }

        Book(int isbn){
            this(isbn , "Unknown" , " Unknown");
        }


        static int getTotalBooks(){
            return totalBooks;
        }

        void borrowBook(){
            if(isBorrowed){
                System.out.println("Sorry, this book is already borrowed");

            }else {
                this.isBorrowed = true;
                System.out.println("Successfully issued the book, Enjoy the book!");
            }
        }

        void returnBook(){
            if(isBorrowed){
                isBorrowed = false;
                System.out.println("Hope you enjoyed the book, please leave the review");
            }else{
                System.out.println("This book is already in the library");
            }

        }


    public static void main(String[] args) {
        Book shyamChiAai = new Book(12 , "shyamChiAai" , "Author");
        Book vedh = new Book(3);
        Book fireOfWings = new Book(67, "fireOfWings" , "APJ Abdul Kalam");
        shyamChiAai.borrowBook();
        shyamChiAai.borrowBook();
        vedh.returnBook();
        shyamChiAai.returnBook();
        System.out.println(Book.getTotalBooks());

    }

}
