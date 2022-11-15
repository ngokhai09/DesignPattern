package DesignPattern.FactoryMethod;

public class TestDisplayService extends DisplayService{

    @Override
    public Report getReport() {
        // TODO Auto-generated method stub
        return new TestReport();
    }
    
}
