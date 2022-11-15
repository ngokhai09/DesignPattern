package DesignPattern.FactoryMethod;

public class TestReport implements Report{

    @Override
    public String report() {
        System.out.println("Reporting test ... ");
        return "Test Report";
    }
    
}
