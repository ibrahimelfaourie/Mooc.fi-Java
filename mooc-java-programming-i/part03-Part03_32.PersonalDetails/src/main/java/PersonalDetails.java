
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> years = new ArrayList<>();


        while (true){

            String input = scanner.nextLine();

            if (input.isEmpty()){
                break;
            }

            String[] pieces = input.split(",");

            names.add(pieces[0]);
            years.add(Integer.valueOf(pieces[1]));

        }

        String longestName = names.get(0);
        for (int i = 0; i<names.size(); i++){
            String name = names.get(i);
            if (name.length()>longestName.length()){
                longestName = name;
            }
        }
        for (int i = 0; i<years.size(); i++){
            sum = sum + years.get(i);
            count++;
        }
        double average = (double) sum/count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);




    }
}
