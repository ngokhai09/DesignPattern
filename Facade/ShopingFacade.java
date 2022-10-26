package DesignPattern.Facade;

public class ShopingFacade
{

    private AccountService accountService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private EmailService emailService;
    private SmsService smsService;

    public ShopingFacade()
    {
        accountService = new AccountService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
        emailService = new EmailService();
        smsService = new SmsService();
    }

    public void buyProductByCashWithFreeShipping(String email)
    {
        accountService.getAccount(email);
        paymentService.PaymentByCash();
        shippingService.FreeShipping();
        emailService.sendEmail(email);
        System.out.println("Done\n");
    }

    public void buyProductByPaypalWithStandardShipping(String email, String mobilePhone)
    {
        accountService.getAccount(email);
        paymentService.paymentByPayPay();
        shippingService.StandardShipping();
        emailService.sendEmail(email);
        smsService.sendSMS(mobilePhone);
        System.out.println("Done\n");
    }
}   
