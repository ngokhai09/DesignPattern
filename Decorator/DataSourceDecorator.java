package DesignPattern.Decorator;

import javax.xml.crypto.Data;

public class DataSourceDecorator implements DataSource{
    private DataSource wrap;

    public DataSourceDecorator(DataSource source){
        this.wrap = source;
    }

    @Override
    public void readData() {
        this.wrap.readData();
        
    }

    @Override
    public void writeData() {
        this.wrap.writeData();
    }

}