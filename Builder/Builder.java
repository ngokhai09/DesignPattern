package DesignPattern.Builder;
public interface Builder{
    public void buildSeats();
    public void buildEngine();
    public void buildTripComputer();
    public void buildGPS();
    public Car getCar();
}