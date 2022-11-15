package DesignPattern.Singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database = Database.getInstance();
        database = Database.getInstance();
        database = Database.getInstance();
    }
}
