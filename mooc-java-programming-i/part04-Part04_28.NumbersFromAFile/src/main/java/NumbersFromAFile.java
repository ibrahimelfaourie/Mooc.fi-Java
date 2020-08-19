
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        ArrayList<Integer> fileInfo = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNextLine()){
                int row = Integer.valueOf(fileScanner.nextLine());
                fileInfo.add(row);
            }
        }
        catch (Exception e){

        }
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int count = 0;
        for (int i = 0; i<fileInfo.size(); i++){
            if (fileInfo.get(i) >= lowerBound && fileInfo.get(i) <= upperBound){
                count++;
            }
        }
        System.out.println("Numbers: " + count);

    }

}
