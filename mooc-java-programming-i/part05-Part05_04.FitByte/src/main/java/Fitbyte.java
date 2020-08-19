public class Fitbyte {

    private int age;
    private int restingHeartRate;
    //private int maximumHeartRate;


    public Fitbyte(int age, int restingHeartRate){

        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum){
        double maximumHeartRate = maximumHeartRate();
        double target = (maximumHeartRate-restingHeartRate) * percentageOfMaximum + restingHeartRate;
        return target;

    }
    public double maximumHeartRate(){
         double max = 206.3 - (0.711 * age);
         return max;

    }
}
