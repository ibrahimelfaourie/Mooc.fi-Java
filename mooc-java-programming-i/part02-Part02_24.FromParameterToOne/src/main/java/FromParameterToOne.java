

public class FromParameterToOne {

    public static void main(String[] args) {


        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int times){

        int i = 0;
        int number = times;

        while (i<times){

            System.out.println(number);
            number--;
            i++;
        }
    }

}
