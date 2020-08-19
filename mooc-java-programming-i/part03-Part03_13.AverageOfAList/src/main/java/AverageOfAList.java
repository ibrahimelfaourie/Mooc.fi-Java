
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.

        ArrayList<Integer> list = new ArrayList<>();

        while (true){

            int input = scanner.nextInt();
            if (input == -1){
                break;
            }
            list.add(input);

        }
        int sum = 0;
        int amou = 0;
        for (int i = 0; i<list.size(); i++){
            int number = list.get(i);
            sum = sum + number;
            amou++;
        }
        double average = (double)sum / amou;

        System.out.println("Average: " + average);
        
    }
}
