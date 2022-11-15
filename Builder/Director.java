package DesignPattern.Builder;

public class Director{

    
    private Builder carBuilder;
    
    public Director(Builder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void build(){
        carBuilder.buildSeats();
        carBuilder.buildEngine();
        carBuilder.buildTripComputer();
        carBuilder.buildGPS();
    }
}