
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                String firstInput = list.get(0);
                String lastInput = list.get(list.size()-1);
                System.out.println(firstInput);
                System.out.println(lastInput);
                break;
            }

            list.add(input);
        }

    }
}
