package DesignPattern.State;

public interface State {
    void display();

    void takeOff(); 
    void landing(); 

    void fast(); 
    void slow (); 
    void normal();
}
