package DesignPattern.FactoryMethod;

public class EsayReport implements Report {

    @Override
    public String report() {
        System.out.println("Reporting essay ... ");
        return "Essay Report";
    }
    
}
