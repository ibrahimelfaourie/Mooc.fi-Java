
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();

        try(Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()){
                String row = fileScanner.nextLine();
                list.add(row);

            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Team:");
        String searchTeam = scan.nextLine();

        int nrGames = 0;
        int nrWins = 0;
        int nrLosses = 0;

        for (int i = 0; i<list.size(); i++){
            String team = list.get(i);
            String[] parts = team.split(",");
            int score1 = Integer.valueOf(parts[2]);
            int score2 = Integer.valueOf(parts[3]);
            if (searchTeam.equals(parts[0])){
                nrGames++;
                if (score1 > score2){
                    nrWins++;
                }else {
                    nrLosses++;
                }
            }else if (searchTeam.equals(parts[1])){
                nrGames++;
                if (score2 > score1){
                    nrWins++;
                }else {
                    nrLosses++;
                }
            }
        }
        System.out.println("Games: " + nrGames);
        System.out.println("Wins: " + nrWins);
        System.out.println("Losses: " + nrLosses);





    }

}
