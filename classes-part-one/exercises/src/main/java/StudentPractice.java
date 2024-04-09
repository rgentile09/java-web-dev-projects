import java.sql.SQLOutput;

public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
Student student = new Student("Ronnie", 99, 1, 4.0);
Teacher historyTeacher = new Teacher("Bill", "Braski", "History", 12);
        System.out.println("NAME: " + historyTeacher.getFirstName());
        System.out.println("NAME: " + student.getName());
    }
}
