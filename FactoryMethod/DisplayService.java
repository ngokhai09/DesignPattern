package DesignPattern.FactoryMethod;

public abstract class DisplayService {
    public void display(){
        Report report = getReport();
        String msg = report.report();
        System.out.println(msg);
    }

    public abstract Report getReport();
}
