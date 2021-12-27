package factories.regionalfactories;
/**
 *
 * @author Simon
 */
import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AmericanHelicopterToy;

public class AmericanHelicopterToyFactory1 extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
        return new AmericanHelicopterToy(serialNumber);
    }
}
