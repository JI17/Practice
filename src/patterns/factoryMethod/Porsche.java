package patterns.factoryMethod;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed 250 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 1 sec");
    }
}
