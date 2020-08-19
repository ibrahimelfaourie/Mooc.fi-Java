
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                System.out.print("From where? ");
                int first = Integer.valueOf(scanner.nextLine());
                int firstInList = numbers.get(first);
                System.out.print("To where? ");
                int last = Integer.valueOf(scanner.nextLine());
                int lastInList = numbers.get(last);
                System.out.println(firstInList);
                System.out.println(lastInList);
                break;
            }

            numbers.add(number);
        }

    }
}
