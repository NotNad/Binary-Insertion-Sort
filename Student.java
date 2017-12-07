public class Student {
    private int id;
    private String name;
    private int age;
    private double gpa;

    public Student(int id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public int getID() {
        return id;
    }

    public String getId() {
        return Integer.toString(id);
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return Integer.toString(age);
    }

    public String getGPA() {
        return Double.toString(gpa);
    }
}