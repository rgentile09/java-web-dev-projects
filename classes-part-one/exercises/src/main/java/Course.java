import java.util.ArrayList;

public class Course {
    private String courseName;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName, Teacher instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

}
