package kata6.toys;

/**
 *
 * @author Entrar
 */

public class SerialNumberGenerator {
    private Integer serialNumber = 0;
    
    public Integer next(){
        return this.serialNumber++;
    }
}
