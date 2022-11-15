package DesignPattern.Decorator;

public class CompressionDecorator extends DataSourceDecorator{

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void readData() {
        System.out.println("Read data Compress");
    }

    @Override
    public void writeData() {
        System.out.println("Write data with Compress");

    }
    

}