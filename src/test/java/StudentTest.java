import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;

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

    @Test
    public void testEmpty() {
        assertTrue(studentEmpty.getGrades().isEmpty());
    }
}
