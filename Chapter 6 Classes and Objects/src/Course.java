public class Course {
    static int maxStudentCapacity = 270;

    String courseName;
    int enrolledStudents;
    String studentName;
    String[] enrollments;

    static void setMaxCapacity(int maxCapacity){
        Course.maxStudentCapacity = maxCapacity;

    }

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = new String[maxStudentCapacity];
    }
    void enrollStudent(String studentName) {
        enrollments[enrolledStudents] = studentName;
        System.out.println("You are enrolled in the course");
        enrolledStudents++;
    }
    void unEnrollStudent(String studentName){
        System.out.println("Student removed");
        enrolledStudents--;
    }

    public static void main(String[] args) {
        Course science = new Course("science");
        Course arts = new Course("arts");
        science.enrollStudent("Komal Jawale");
        science.unEnrollStudent("nidhish");
        arts.unEnrollStudent("Sakshi");
        System.out.println(Course.maxStudentCapacity);
    }


















}
