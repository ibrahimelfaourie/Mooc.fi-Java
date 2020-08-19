
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumbersSum = 0;
        int positiveNumbersAmount = 0;


        while (true) {

            System.out.println("Give a number:");
            int numberInput = Integer.valueOf(scanner.nextLine());

            if (numberInput > 0) {

                positiveNumbersAmount = positiveNumbersAmount + 1;
                positiveNumbersSum = positiveNumbersSum + numberInput;

            } else if (numberInput < 0) {
                continue;
            } else if (positiveNumbersAmount <= 0) {

                System.out.println("Cannot calculate the average");
                break;

            } else if (numberInput == 0) {

                System.out.println((double) positiveNumbersSum / positiveNumbersAmount);
                break;
            }
        }

    }
}
