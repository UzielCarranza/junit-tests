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



}
