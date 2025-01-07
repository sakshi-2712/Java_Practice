import java.util.ArrayList;

class Student {
    String name;
    int rollNumber;
    ArrayList<Integer> grades;
    int attendance;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new ArrayList<>();
        this.attendance = 0;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / (double) grades.size();
    }

    public void markAttendance() {
        attendance++;
    }

    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverageGrade());
        System.out.println("Attendance: " + attendance);
    }
}

public class SchoolManagementSystem {
    public static void main(String[] args) {

        Student student1 = new Student("sakshi", 101);
        Student student2 = new Student("aher", 102);

        student1.addGrade(85);
        student1.addGrade(90);
        student1.addGrade(78);

        student2.addGrade(88);
        student2.addGrade(76);
        student2.addGrade(92);

        student1.markAttendance();
        student1.markAttendance();
        student2.markAttendance();

        student1.displayDetails();
        student2.displayDetails();
    }
}
