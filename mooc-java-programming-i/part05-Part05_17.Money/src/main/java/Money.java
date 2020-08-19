
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + (cents / 100);
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money((euros + addition.euros), (cents + addition.cents)); // create a new Money object that has the correct worth

        return newMoney;
    }

    public boolean lessThan(Money compared){
        Money money = new Money(euros,cents);
        if (money.euros < compared.euros){
            return true;

        }else if (money.euros == compared.euros && money.cents < compared.cents){
            return true;

        }else{
            return false;
        }
    }

    public Money minus(Money decreaser) {
        /*
        double e1 = euros;
        double c1 = (double) cents/100;
        double together1 = e1 + c1;

        double e2 = decreaser.euros;
        double c2 = (double) decreaser.cents/100;
        double together2 = e2 + c2;
        
         */

        int eu = euros - decreaser.euros;
        int ce = cents;

        if ((euros - decreaser.euros > 0) || (euros - decreaser.euros == 0 && cents - decreaser.cents >0)){

            while (true){
                if (ce - decreaser.cents > 0){
                    ce = ce - decreaser.cents;
                    break;
                }else {
                    eu --;
                    ce = 100;
                }
            }
        }else {
            eu = 0;
            ce= 0;
        }
        Money diffrence = new Money(eu,ce);
        return diffrence ;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
