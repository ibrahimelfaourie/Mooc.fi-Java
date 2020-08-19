
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double gift = Double.valueOf(scan.nextLine());

        if(gift<5000){
            System.out.println("No tax!");
        }else if (gift>4999 && gift<25001){
            System.out.println("Tax: " + ((gift-5000)*(0.08) + 100));
        }else if (gift>24999 && gift<55001) {
            System.out.println("Tax: " + ((gift - 25000) * (0.10) + 1700));
        }else if (gift>54999 && gift<200001) {
            System.out.println("Tax: " + ((gift - 55000) * (0.12) + 4700));
        }else if (gift>199000 && gift<1000001) {
            System.out.println("Tax: " + ((gift - 200000) * (0.15) + 22100));
        }else if (gift>999000) {
            System.out.println("Tax: " + ((gift - 1000000) * (0.17) + 142100));
        }

    }
}
