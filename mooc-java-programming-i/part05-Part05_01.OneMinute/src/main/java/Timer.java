public class Timer {

    ClockHand seconds = new ClockHand(60);
    ClockHand miliSeconds = new ClockHand(100);


    public String toString(){
        return seconds + ":" + miliSeconds;

    }


    public void advance() {
        miliSeconds.advance();
        if (miliSeconds.value() == 0){
            seconds.advance();
        }
    }


}
