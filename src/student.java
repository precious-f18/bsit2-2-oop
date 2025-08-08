public class student {
    private String name;
    private int age;
    private String course;
    private double grade1;
    private double grade2;
    private double grade3;

    public studentInfo(String nameStudent, int studentAge, String studentCourse, double studentGrade1, double studentGrade2, double studentGrade3) {
        this.name = nameStudent;
        this.age = studentAge;
        this.course = studentCourse;
        this.grade1 = studentGrade1;
        this.grade2 = studentGrade2;
        this.grade3 = studentGrade3;
    }

    public void displayInfo() {
        System.out.println("Student Information: ");
        System.out.println("Name: " + name + " " + "Age: " + age + " " + "Course: " + course);
    }

    public void calculateAverage() {
        for (int i = 3; i <= 3; i++) {

            System.out.println("Grades: " + grade1 + "," + grade2 + "," + grade3);
        }
    }

    public void getLetterGrade() {
        if (average >= 90) {
            System.out.println("Letter Grade: A");
        }
        else if (average >= 80-89) {
            System.out.println("Letter Grade: B");
        }
        else if (average >= 70-79) {
            System.out.println("Letter Grade: C");
        }
        else if (average >= 60-69) {
            System.out.println("Letter Grade: D");
        }
        else {
                System.out.println("Letter Grade: F");
        }
    }

    public void isPassing() {

    }
