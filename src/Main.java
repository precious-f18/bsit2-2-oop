import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        int totalNumber = 0;
        Scanner scanner = new Scanner (System.in);

        for (int number = 1; number <= 5; number++) {
            System.out.println("Enter number" + " " + number + ":");
            totalNumber = scanner.nextInt();
            totalNumber += number;
        }
            System.out.println("Total Number: " + totalNumber);

    }
}
