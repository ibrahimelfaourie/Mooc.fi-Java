
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String stringinput = scan.nextLine();
        System.out.println("Give an integer:");
        int integerinput = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double doubleinput = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean booleaninput = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + stringinput);
        System.out.println("You gave the integer " + integerinput);
        System.out.println("You gave the double " + doubleinput);
        System.out.println("You gave the boolean " + booleaninput);


    }
}