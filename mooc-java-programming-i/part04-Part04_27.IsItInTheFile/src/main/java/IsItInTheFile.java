
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        ArrayList<String> list = new ArrayList<>();

       try(Scanner scanFile = new Scanner(Paths.get(file))){

           while (scanFile.hasNextLine()){
               String row = scanFile.nextLine();
               list.add(row);
           }

       }
       catch (Exception e){

       }
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        if (list.contains(searchedFor)){
            System.out.println("Found!");
        }else if (list.isEmpty()){
            System.out.println("Reading the file " + file + " failed.");
        }else {
            System.out.println("Not found.");
        }

    }
}
