package kata6.toys;

/**
 *
 * @author Entrar
 */

public class ToyBusiness {

    private final SerialNumberGenerator generator = new SerialNumberGenerator();

    public Car createCar() {
        Car car = new Car(generator.next());
        car.pack();
        car.label();
        return car;
    }

    public Helicopter createHelicopter() {
        Helicopter helicopter = new Helicopter(generator.next());
        helicopter.pack();
        helicopter.label();
        return helicopter;
    }
}
