import org.junit.Test;


import static org.junit.Assert.*;


public class cohorttest {


//    @Test
//    public void testAddStudent(){
//        Cohort cohort = new Cohort();
//        Student student = new Student(0,"test");
//        cohort.addStudent(student);
//        assertNotNull(student.getGrades());
//        assertNotNull(student);
//    };


    @Test
    public void addInstanceOfStudent() {
        Cohort fortran = new Cohort();

        fortran.addStudent(new Student(5, "uziel"));
        assertNotNull(fortran.getStudents());


//        student name added
        assertEquals("uziel", fortran.getStudents().get(0).getName());
    }

    @Test
    public void cohortInstanceGetCurrentList() {
        Cohort fortran = new Cohort();
        Student student = new Student(0,"Uziel");
        fortran.addStudent(student);
        assertFalse("is not empty", fortran.getStudents().isEmpty());
    }

    @Test
    public void correctAverage(){
        Cohort cohort = new Cohort();
        Student s1 = new Student(0,"test");
        Student s2 = new Student(1,"test2");
        s1.addGrade(5);
        s1.addGrade(10);
        s1.addGrade(7);
        s2.addGrade(12);
        s2.addGrade(5);
        s2.addGrade(6);

        cohort.addStudent(s1);
        cohort.addStudent(s2);


        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertEquals("5 is greater than 4", 7.5, cohort.getCohortAverage(), 0.0);
    }


}
