package DesignPattern.Decorator;

public class FileDataSource implements DataSource {

    public FileDataSource() {
    }

    @Override
    public void readData() {
        System.out.println("Read data normal");
    }

    @Override
    public void writeData() {
        System.out.println("Write data normal");
    }
}