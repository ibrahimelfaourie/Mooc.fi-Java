
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> age = new ArrayList<>();

        while (true) {

            String input = scanner.nextLine();
            String[] pieces = input.split(",");

            if (input.isEmpty()) {
                break;
            }

            age.add(Integer.valueOf(pieces[1]));

        }

        int oldest = age.get(0);
        for (int i = 0; i < age.size(); i++) {
           int ages = age.get(i);
            if (ages >= oldest){
                oldest = ages;
            }
        }
        System.out.println(oldest);



    }
}

