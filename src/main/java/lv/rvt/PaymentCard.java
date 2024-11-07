package lv.rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance = this.balance - 2.60;

        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance = this.balance - 4.60;
        }
    }
    public void addMoney(double amount) {
        double sum = this.balance + amount;
        
        if (sum <= 150) {  
            this.balance = this.balance + amount;
        } else {
            this.balance = 150;
        }
        if (amount <= 0) {
            this.balance = this.balance + 0;
        }
   
  
    }

    public String toString() {
       return "The card has a balance of " + this.balance + " euros";
    }
}
