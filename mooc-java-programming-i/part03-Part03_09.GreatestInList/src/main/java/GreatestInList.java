
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();


        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            list.add(input);
            if (input == -1) {
                break;
            }
        }
        int greatestNumber = list.get(0);

        for(int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (greatestNumber < number) {
                greatestNumber = number;
            }
        }

        System.out.println("The greatest number: " + greatestNumber);


    }
}
