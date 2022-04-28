import java.util.ArrayList;
import java.util.List;

public class Student {
    int id;
    String name;
    ArrayList<Integer> grades;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int i) {
        grades = new ArrayList<>();
        grades.add(i);
    }

    //    public double getGradeAverage() {
//        int total = this.grades.stream().reduce(0, (sum, currentGradeElement) -> {
//            return sum + currentGradeElement;
//        });
//        return (double) total / this.grades.size();
//    }

}
