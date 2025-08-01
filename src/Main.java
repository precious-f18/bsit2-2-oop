import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        int totalNumber = 0;
        Scanner scanner = new Scanner (System.in);

        for (int num = 1; num <= 5; num++) {
            System.out.println("Enter number" + " " + num + ":");
            int number = scanner.nextInt();
            totalNumber += number;
        }
            System.out.println("Total Number: " + totalNumber);

    }
}
