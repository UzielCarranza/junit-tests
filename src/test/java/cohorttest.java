import org.junit.Test;


import static org.junit.Assert.*;


public class cohorttest {


    @Test
    public void testAddStudent(){
        Cohort cohort = new Cohort();
        Student student = new Student(0,"test");
        cohort.addStudent(student);


    };

}
