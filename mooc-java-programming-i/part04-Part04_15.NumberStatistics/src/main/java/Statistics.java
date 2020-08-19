
public class Statistics {

    private int count;
   // private int sumEven = 0;
   // private int sumOdd = 0;
    private int sum = 0;


    public Statistics(){


    }

    public void addNumber(int number){
        count++;
        sum = sum + number;
    }
/*
    public void addEvenNumber(int number){
        count++;
        sum = sum + number;
    }

 */
/*
    public void addOddNumber(int number){
        count++;
        sum = sum + number;
    }

 */
    public int getCount(){
        return count;
    }
    public int sum() {
        return sum;
    }
    /*
    public int sumEven(){
        return sumEven;
    }

     */
    /*
    public int sumOdd(){
        return sumOdd;
    }

     */
    public double average() {
        if (sum !=0){
            return (double)sum/count;
        }else{
           return 0;
        }


    }

}
