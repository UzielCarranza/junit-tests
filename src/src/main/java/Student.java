import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    long studentId;
    String name;
    ArrayList<Integer> grades;

    public Student() {
    }

    public long getId() {
        return studentId;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage(){
        Object[] arrayName = this.grades.toArray();
        Arrays.sort(arrayName);
        double median;
        if (arrayName.length % 2 == 0) {
            median = ((double) arrayName[arrayName.length / 2] + (double) arrayName[arrayName.length / 2 - 1]) / 2;
        } else {
            median = (double) arrayName[arrayName.length / 2];
        }
        return median;
    }
}
