
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int quaOfNumbers = 0;

        while (true){

            System.out.println("Give a number:");
            int numberInput = Integer.valueOf(scanner.nextLine());

            if(numberInput != 0){

                quaOfNumbers = quaOfNumbers +1;
                sumOfNumbers = sumOfNumbers + numberInput;
            }else {
                System.out.println("Average of the numbers: " + ((double)sumOfNumbers/quaOfNumbers));
                break;
            }
        }

    }
}
