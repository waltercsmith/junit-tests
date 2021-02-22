import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentNameEquals(){
        String expected = "Delano";
        String actual = "Delano";

        assertEquals(expected,actual);
    }


    @Test
    public void testIfStudentIdEquals(){
        long expected = 308L;
        long actual = 308;

        assertEquals(expected,actual);
    }

    @Test
    public void testIfStudentGradesEqual(){
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(98);
        grades.add(90);

        ArrayList<Integer> moreGrades = new ArrayList<>();
        moreGrades.add(98);
        moreGrades.add(90);

        assertEquals(grades,moreGrades);
    }


}
