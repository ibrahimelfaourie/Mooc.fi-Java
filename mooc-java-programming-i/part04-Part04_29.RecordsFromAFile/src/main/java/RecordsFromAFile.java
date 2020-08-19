
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(file))){

            while (fileScanner.hasNextLine()){
                String row = fileScanner.nextLine();
                list.add(row);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        for (int i = 0; i < list.size(); i++){
            String line = list.get(i);
            String[] parts = line.split(",");
            int age = Integer.valueOf(parts[1]);

            if (age == 1){
                System.out.println(parts[0] + ", age: " + parts[1] + " year");
            }else {
                System.out.println(parts[0] + ", age: " + parts[1] + " years");
            }
        }

    }
}
