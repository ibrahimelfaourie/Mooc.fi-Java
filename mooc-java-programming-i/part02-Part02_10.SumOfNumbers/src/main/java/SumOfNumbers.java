
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;

        while (true){

            System.out.println("Give a number:");
            int numbers = Integer.valueOf(scanner.nextLine());

            if (numbers != 0){
                sumOfNumbers = sumOfNumbers + numbers;
            } else {
                System.out.println("Sum of the numbers: " + sumOfNumbers);
                break;
            }
        }

    }
}
