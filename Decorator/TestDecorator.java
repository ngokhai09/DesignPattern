package DesignPattern.Decorator;

public class TestDecorator{
    public static void main(String[] args) {
        DataSource source = new FileDataSource();
        source.writeData();
        source.readData();

        DataSource decorator = new EncryptionDecorator(source);
        decorator.writeData();
        decorator.readData();

        decorator = new CompressionDecorator(source);
        decorator.writeData();
        decorator.readData();
    }
}