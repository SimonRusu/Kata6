package factories.regionalfactories;
/**
 *
 * @author Simon
 */
import factories.ToyFactory;
import toyproduct.Toy;
import toyproduct.models.AsianHelicopterToy;

public class AsianHelicopterToyFactory extends ToyFactory{

    @Override
    public Toy createToy(Integer serialNumber) {
                return new AsianHelicopterToy(serialNumber);
    }

}
