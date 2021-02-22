import java.util.ArrayList;

public class Student {


//    constructor that sets both the name and id property
    public Student(String studentName, long studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }




    // returns the student's name
    public String getStudentName() {
        return studentName;
    }

    String studentName;


    // returns the student's id
    public long getStudentId() {
        return studentId;
    }

    long studentId;


    // returns the list of grades

    public ArrayList<Integer> getStudentGrades() {
        return studentGrades;
    }

    ArrayList<Integer> studentGrades;



}

