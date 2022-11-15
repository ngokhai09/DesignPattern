package DesignPattern.Builder;

public class Car {
    private String carType;
    private String seats;
    private String Engine;
    private String tripComputer;
    private String GPS;
    
    public Car(String carType) {
        this.carType = carType;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public String getSeats() {
        return seats;
    }
    public void setSeats(String seats) {
        this.seats = seats;
    }
    public String getEngine() {
        return Engine;
    }
    public void setEngine(String engine) {
        Engine = engine;
    }
    public String getTripComputer() {
        return tripComputer;
    }
    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }
    public String getGPS() {
        return GPS;
    }
    public void setGPS(String gPS) {
        GPS = gPS;
    }
    @Override
    public String toString() {
        return "Car [carType=" + carType + ", seats=" + seats + ", Engine=" + Engine + ", tripComputer=" + tripComputer
                + ", GPS=" + GPS + "]";
    }
    
}
