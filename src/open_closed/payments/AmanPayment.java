package open_closed.payments;

public class AmanPayment extends PayMethod{

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public AmanPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay() {
        // TODO : ..........
    }
}
