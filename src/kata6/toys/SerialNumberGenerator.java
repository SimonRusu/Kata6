package kata6.toys;

/**
 *
 * @author Simon
 */

public class SerialNumberGenerator {
    private Integer serialNumber = 0;
    
    public Integer next(){
        return this.serialNumber++;
    }
}
