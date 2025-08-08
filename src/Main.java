public class Main {

}

public static void main(String[] args) {

    student student1 = new student("Bob", "19", "BSCS", 92.0, 95.0, 89.0);
    student student2 = new student("Charlie", "21", "BSIT", 65.0, 70.0, 68.0);

        System.out.println();
        student1.displayInfo();
        student2.displayInfo();

        System.out.println();
        student1.calculateAverage();
        student2.calculateAverage();

        System.out.println();
        student1.getLetterGrade();
        student2.getLetterGrade();

        System.out.println();
        student1.isPassing();
        student2.isPassing();
    }