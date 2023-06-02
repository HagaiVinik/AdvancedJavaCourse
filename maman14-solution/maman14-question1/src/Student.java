public class Student implements Comparable<Student> {
    private String name;
    private String id;
    private int grade;

    public Student(String name, String id, int grade)
    {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", ID: " + id + ", Grade: " + grade;
    }

    @Override
    public int compareTo(Student student)
    {
        return grade - student.grade;
    }
}
