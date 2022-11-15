package DesignPattern.FactoryMethod;

public class CodeReport implements Report{

    @Override
    public String report() {
        System.out.println("Reporting code ... ");
        return "Code Report";
    }
    
}
