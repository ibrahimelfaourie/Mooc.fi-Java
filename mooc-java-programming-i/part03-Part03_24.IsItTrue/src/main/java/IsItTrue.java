
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String input = String.valueOf(scanner.nextLine());

        if (input.equals("true")){
            System.out.println("You got it right!");
        }else {
            System.out.println("Try again!");
        }


/*
        while (true) {
            System.out.println("Give a string:");
            String input = String.valueOf(scanner.nextLine());

            if (input.equals("true")) {
                System.out.println("You got it right!");
                break;
            }else {
                System.out.println("Try again!");
            }
        }

 */
    }
}
