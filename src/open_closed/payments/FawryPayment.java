package open_closed.payments;

public class FawryPayment extends PayMethod{

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public FawryPayment(double amount) {
        this.amount = amount;
    }

    @Override
    public void pay() {
//        TODO : .............
    }
}
