import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StudentTest {

    Student studentEmpty;
    Student studentList;
    Student studentOne;

    @Before
    public void setUp() {

//        empty list
        studentEmpty = new Student();


//        one student
        studentOne = new Student("test", 324);
        studentOne.addGrade(10);
        studentOne.addGrade(9);
        studentOne.addGrade(9);
        studentOne.addGrade(9);
    }

//   @Test
//    public void setStudentEmpty(){
//        assertTrue(studentEmpty.getGrades().isEmpty());
//    }

    @Test
    public void testGetId() {
        assertTrue(studentEmpty.getGrades().isEmpty());
    }

}
