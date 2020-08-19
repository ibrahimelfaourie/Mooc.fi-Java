
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        String stars = "*";

        for (int i = 0; i<array.length; i++){
           int valueInIndex =  array[i];

           int start;
           for(start = 0; start<valueInIndex; start++){
               System.out.print(stars);
           }
            System.out.println("");

        }
    }

}
