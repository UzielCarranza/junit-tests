import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class StudentTest {


    @Test
    public void studentTest() {
        Student student = new Student();

    }

//    @Test
//    public void StudentTestAverage(){
//        for (int i = 0; i < ; i++) {
//
//        }
//
//    }


    @Test
    public void getClassAverage_GivenValidInput_ReturnClassAverage() {
        List<Student> students = new ArrayList<>();

        int[] grades = {0, 50, 100};
        int modifier = 20;
        for (int i = 0; i <= 3; i++) {
            Student student = new Student();

            if (i == 2) {
                student.addGrade(80);
            } if (i == 0) {
                student.addGrade(75);
            }
            if (i == 1){
                student.addGrade(53);
            }
            student.addGrade(2);
        }
    }
}
