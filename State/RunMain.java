package DesignPattern.State;

public class RunMain {
    public static void main(String[] args) {
        State plane = new Plane();

        plane.takeOff();
        plane.fast();
        plane.landing();

        plane.slow();
        plane.normal();
        plane.slow();
        plane.landing();
    }
}
