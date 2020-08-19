

public class FromOneToParameter {

    public static void main(String[] args) {

        printUntilNumber(5);

    }

    public static void printUntilNumber(int times){

        int i = 0;
        int number = 0;

        while(i<times){
            i++;
            number++;
            System.out.println(number);
        }



    }

}
