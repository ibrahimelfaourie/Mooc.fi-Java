
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while(i<number){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i<number){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        int sizes = size;
        sizes = sizes -1;
        while (i<=size){
            printSpaces(sizes);

            printStars(i);
            sizes--;

            i++;
        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        int extraStars = 0;
        int sizes = height;
        sizes = sizes -1;
        while (i<=height){
            printSpaces(sizes);
            sizes--;
            printStars(i+extraStars);
            extraStars++;
            i++;
            if(i>height){
                printSpaces(i-3);
                printStars(3);
                printSpaces(i-3);
                printStars(3);
            }
        }



    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);

    }
}
