
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public void advanceByOne(){
        if ((day)<30){
            day++;
        }else if (month<12){
            day=1;
            month++;
        }else if (month==12 && day<30){
            day++;
        }else if (month == 12 && day == 30){
            day = 1;
            month = 1;
            year++;
        }
    }
    public void advance(int days){
        if ((day+days)<=30 && month<=12){
            day = day + days;
        }else if ((day + days)>30 && month<12){
            for (int i = 0; i<days; i++){
                day++;
                if (day >= 30){
                    month++;
                    day = 1;
                }
            }
        }else if (month==12 && (day + days) <= 30){
            day= day + days;
        }else if (month==12 && (day + days) > 30){

            for (int i =0;i<days; i++){
                day++;
                if (day>=30){
                    year++;
                    month =1;
                    day= 1;
                }
            }
                
        }
    }

    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(day, month, year);
        newDate.advance(days);
        return newDate;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
