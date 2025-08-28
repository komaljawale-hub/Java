import java.util.Scanner;

public class GradeOnMarks {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);
        System.out.println("Your grade according to your marks is....");
        System.out.println("Enter your obtained marks: ");
        double obtainedMarks = marks.nextInt();
        System.out.println("Enter total marks: ");

        double totalMarks = marks.nextInt();
        double percentage = (obtainedMarks / totalMarks)* 100;
        System.out.println(percentage);

        if (percentage >= 90){
            System.out.println("You got \"A\" Grade");
        } else if (percentage >= 75) {
            System.out.println("You got \"B\" Grade");
        } else if (percentage >= 60) {
            System.out.println("You got \"C\" Grade,you need to study harder");
        } else if (percentage >= 30) {
            System.out.println("You got \"D\" Grade,you seriously need to work on your academics");
        }else {
            System.out.println("Sorry you have failed,better luck next time");
        }
    }
}
