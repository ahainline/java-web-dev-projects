import java.util.HashMap;

public class Course {
    private String title;
    private String description;
    private Teacher teacher;
    private int credits;
    private HashMap<Student, Integer> students = new HashMap<>();

    public Course(String title, String description, Teacher teacher, int credits, HashMap<Student, Integer> students) {
        this.title = title;
        this.description = description;
        this.teacher = teacher;
        this.credits = credits;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    public HashMap<Student, Integer> getStudents() {
        return students;
    }
    public void setStudents(HashMap<Student, Integer> students) {
        this.students = students;
    }
}
