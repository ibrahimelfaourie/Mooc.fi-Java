public class PaymentCard {

    private double balance;


    public PaymentCard(double openingBalance){

        this.balance = openingBalance;

    }
    public String toString() {
        // write code here
        String label = "The card has a balance of "+balance+" euros";
        return label;
    }

    public void eatAffordably() {
        double cheapMeal = 2.6;
        if (balance>=cheapMeal) {
            balance = balance - cheapMeal;
        }

    }

    public void eatHeartily() {
        double expensiveMeal = 4.6;
        if (balance>=expensiveMeal){
            balance = balance - expensiveMeal;
        }
    }

    public void addMoney(double amount) {
        if (amount>0){
            if(balance+amount <= 150){
                balance = balance +amount;
            }else if(balance + amount >= 150){
                balance = 150;
            }
        }

    }
}
