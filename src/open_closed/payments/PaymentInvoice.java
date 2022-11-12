package open_closed.payments;

public class PaymentInvoice {
    public void printInvoice(PayMethod pay){
        pay.pay();
    }
}
