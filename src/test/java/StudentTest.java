import org.junit.Test;
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
//    public class Student {
//
//    }

}
