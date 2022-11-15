package DesignPattern.Decorator;

public class EncryptionDecorator extends DataSourceDecorator{

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void readData() {
        System.out.println("Read Data with Encryption");
    }

    @Override
    public void writeData() {
        System.out.println("Write Data with Encryption");
    }
    
}