import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentInfo student = new StudentInfo();

        System.out.print("Enter Student ID: ");
        student.studentID = input.nextLine();

        System.out.print("Enter First Name: ");
        student.firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        student.lastName = input.nextLine();

        System.out.print("Enter Course: ");
        student.course = input.nextLine();

        System.out.print("Enter Section: ");
        student.section = input.nextLine();

        System.out.println(" ");

        System.out.println("STUDENT INFORMATION");
        System.out.println("Student ID: " + student.studentID);
        System.out.println("Student Name: " + student.firstName + " " + student.lastName);
        System.out.println("Course: " + student.course);
        System.out.println("Section: " + student.section);

        System.out.println(" ");

        System.out.print("Midterm Exam Score: ");
        student.midtermExamScore = input.nextInt();

        System.out.print("Final Exam Score: ");
        student.finalExamScore = input.nextInt();

        System.out.print("Project Score: ");
        student.projectScore = input.nextInt();

        System.out.print("Attendance Percentage: ");
        student.attendancePercentage = input.nextInt();

        double averageScore = (student.midtermExamScore + student.finalExamScore +  student.projectScore + student.attendancePercentage) / 4.0;

        System.out.println(" ");

        System.out.println("Average Score: " + averageScore);

        if (averageScore < 75) {
            System.out.println("Remarks: FAILED");
        } else {
            System.out.println("Remarks: PASSED");
        }

        input.close();
    }
}