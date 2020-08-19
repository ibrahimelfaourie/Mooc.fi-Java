
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {

        ArrayList<Integer> numberrr = new ArrayList<>();

        numberrr.add(10);
        numberrr.add(5);
        numberrr.add(6);
        numberrr.add(-1);

        System.out.println(sum(numberrr));
    }

    public static int sum(ArrayList<Integer> numbers){

        int summ = 0;
        for (int number : numbers){
            summ = summ + number;
        }
        return summ;
    }

}
