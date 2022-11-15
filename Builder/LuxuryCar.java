package DesignPattern.Builder;

public class LuxuryCar implements Builder {

    private Car car = new Car("Luxury");


    @Override
    public void buildSeats() {
        car.setSeats("7");
        
    }

    @Override
    public void buildEngine() {
        car.setEngine("300HP");
        
    }

    @Override
    public void buildTripComputer() {
        car.setTripComputer("M2");
        
    }

    @Override
    public void buildGPS() {
        car.setGPS("Global GPS");
    }

    @Override
    public Car getCar() {
        return car;
    }
    
    
}
