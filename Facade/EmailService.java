package DesignPattern.Facade;

class EmailService{
    public void sendEmail(String mailTo){
        System.out.println("Send Email to " + mailTo);
    }
}