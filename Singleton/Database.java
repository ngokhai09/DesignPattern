package DesignPattern.Singleton;

public class Database {
    private static Database database = null;

    private Database(){
        System.out.println("Create Database");
    }

    public static Database getInstance(){
        if(database == null){
            synchronized(Database.class){
                if(database == null){
                    database = new Database();
                }
            }
        }
        return database;
    }
}
