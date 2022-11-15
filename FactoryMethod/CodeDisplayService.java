package DesignPattern.FactoryMethod;

public class CodeDisplayService extends DisplayService{

    @Override
    public Report getReport() {
        return new CodeReport();
    }
    
}
