
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> a = new ArrayList<>();

        while (true){

            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
            if (id.isEmpty()){
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            Archive archive = new Archive(id,name);

            boolean found = false;

            for (int i = 0;i<a.size(); i++){
                String compareId = a.get(i).getId();
                if (compareId.equals(id)){
                    found = true;
                }
            }
            if (found == false){
                a.add(archive);
            }

        }
        for (int i = 0; i<a.size(); i++){
            System.out.println(a.get(i));
        }



    }
}
