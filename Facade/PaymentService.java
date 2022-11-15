package DesignPattern.Facade;

class PaymentService {
    public void paymentByPayPay() {
        System.out.println("Payment by PayPay");
    }

    public void paymentByCreditCard() {
        System.out.println("Payment by Credit Card");
    }

    public void PaymentByEBankingAccount() {
        System.out.println("Payment by E-banking account");
    }

    public void PaymentByCash() {
        System.out.println("Payment by cash");
    }
}
