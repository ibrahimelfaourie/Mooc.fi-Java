
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();


        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            Book book = new Book(name, publicationYear);

            boolean found = false;

            for (int i = 0; i<books.size(); i++){
                String namee = books.get(i).getName();
                int year = books.get(i).getPublicationYear();
                if (namee.equals(name) && year == publicationYear){
                   found = true;
                    System.out.println("finns redan");
                }
            }
            if (found == false){
                books.add(book);
            }

        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());

    }
}
