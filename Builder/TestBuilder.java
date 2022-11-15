package DesignPattern.Builder;
public class TestBuilder{
    public static void main(String[] args) {
        Builder carBuilder = new SportCar();
        Director carDirector = new Director(carBuilder);
        carDirector.build();
        Car car = carBuilder.getCar();
        System.out.println(car);
        System.out.println();
        carBuilder = new LuxuryCar();
        carDirector = new Director(carBuilder);
        carDirector.build();
        car = carBuilder.getCar();
        System.out.println(car);
    }
}