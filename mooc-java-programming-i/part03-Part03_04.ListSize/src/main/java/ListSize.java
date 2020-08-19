
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (true) {
            String input = scanner.nextLine();
            i++;

            if (input.equals("")) {
                System.out.println("In total: " + ( i-1));
                break;
            }

            list.add(input);
        }

    }
}
