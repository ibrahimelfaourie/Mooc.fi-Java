
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        int amou = 0;
        int even = 0;
        int odd = 0;



        while (true) {


            System.out.println("Give numbers:");
            int numbers = Integer.valueOf(scanner.nextLine());
            if (numbers != -1 && numbers%2 == 0){
                sum = sum +numbers;
                amou++;
                even++;
                continue;
            }else if (numbers != -1 && numbers%2 == 1) {
                sum = sum + numbers;
                amou++;
                odd++;
                continue;
            } else{
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + amou);
                System.out.println("Average: " + ((double)sum/amou));
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            }
        }


    }
}
