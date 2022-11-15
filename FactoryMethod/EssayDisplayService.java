package DesignPattern.FactoryMethod;

public class EssayDisplayService extends DisplayService{

    @Override
    public Report getReport() {
        // TODO Auto-generated method stub
        return new EsayReport();
    }
    
}
