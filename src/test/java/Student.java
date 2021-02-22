import java.util.ArrayList;
import java.util.List;

public class Student {


//    constructor that sets both the name and id property
    public Student(String studentName, long studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }


//    adds the given grade to the grades list
    public void addGrade(int grade){
        this.studentGrades.add(grade);
    }



//     returns the student's name
    public String getStudentName() {
        return studentName;
    }

    String studentName;


//     returns the student's id
    public long getStudentId() {
        return studentId;
    }

    long studentId;


//     returns the list of grades

    public ArrayList<Integer> getStudentGrades() {
        return studentGrades;
    }

    ArrayList<Integer> studentGrades;

    public double getGradeAverage(List<Integer> studentGrades){
        double sum = 0;
    for (int i = 0; i < studentGrades.size(); i++){
            sum += i;
    }
    return sum / studentGrades.size();
    }



}

