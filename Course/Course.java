package Course;

import java.util.ArrayList;

public class Course implements Cloneable{
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }

    public int getStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    protected Object clone() {
        try{
            Course newCourse=(Course)super.clone();
            newCourse.students=(java.util.ArrayList)students;
            return newCourse;
        }catch (CloneNotSupportedException e){
            return null;
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", students=" + students +
                ", numberOfStudents=" + numberOfStudents +
                '}';
    }

    public static void main(String[] args) {
        Course c1=new Course("C++");
        c1.addStudent("Latifjonov Abduqodir Baxtiyorjon o'g'li");
        System.out.println(c1);
        Course c2=(Course)c1.clone();
        System.out.println("c2 = " + c2);
    }

}
