
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> allNames = new ArrayList<>();
        ArrayList<Integer> allAges = new ArrayList<>();
        ArrayList<String> allNamesAndAges = new ArrayList<>();

        while (true) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }
            String[] pieces = input.split(",");

              allAges.add(Integer.valueOf(pieces[1]));
              allNamesAndAges.add(input);

        }

        int oldest=0;
        int age;
        for (int i = 0; i < allAges.size(); i++) {
            age = allAges.get(i);
            if (age >= oldest) {
                oldest = age;
            }
        }

        for (int i = 0; i<allNamesAndAges.size(); i++){
            String nameAge = allNamesAndAges.get(i);
            //char lastNumber = nameAge.charAt(nameAge.length()-1);
           // int oldestFromName = Integer.parseInt(String.valueOf(lastNumber));
            String[] piecess = nameAge.split(",");
            int oldestFromName = Integer.valueOf(piecess[1]);

            if (oldestFromName == oldest){
               // String[] pieces = nameAge.split(",");
                String nameOfTheOldest = piecess[0];
                System.out.println("Name of the oldest: "+ nameOfTheOldest);
            }
        }

    }
}

