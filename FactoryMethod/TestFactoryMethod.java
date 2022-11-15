package DesignPattern.FactoryMethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        DisplayService service = new CodeDisplayService();
        service.display();

        service = new EssayDisplayService();
        service.display();

        service = new TestDisplayService();
        service.display();
    }
}
