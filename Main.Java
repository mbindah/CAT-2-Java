import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student grade: ");
        int grade = scanner.nextInt();
        Student student = new Student(name, grade);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        scanner.close();
    }
}
