import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scan = new Scanner(System.in);
        ArrayList<Book> libery= new ArrayList<>();

        while (true){
            System.out.print("Title: ");
            String title = scan.nextLine();
            if (title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int page = Integer.valueOf(scan.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());

            libery.add(new Book(title,page,year));
        }
        System.out.println("What information will be printed?");
        String information = scan.nextLine();

        if (information.equals("everything")){
            for (int i = 0; i<libery.size(); i++){
                System.out.println(libery.get(i).getTitle() + ", " + libery.get(i).getPage() + " pages, " + libery.get(i).getYear());
            }

        }else if (information.equals("name")){
            for (int i = 0; i<libery.size(); i++){
                System.out.println(libery.get(i).getTitle());
            }
        }

    }
}
