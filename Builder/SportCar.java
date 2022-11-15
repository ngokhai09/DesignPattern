package DesignPattern.Builder;

public class SportCar implements Builder{

    private Car car = new Car("Sport Car");

    @Override
    public void buildSeats() {
        car.setSeats("2");
        
    }

    @Override
    public void buildEngine() {
        car.setEngine("500HP");
        
    }

    @Override
    public void buildTripComputer() {
        car.setTripComputer("A30");
        
    }

    @Override
    public void buildGPS() {
        car.setGPS("Local GPS");
    }

    @Override
    public Car getCar() {
        return car;
    }
    
}