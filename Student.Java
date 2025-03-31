public class Student {
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        Student student = new Student("Olive", 32);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
    }
}



