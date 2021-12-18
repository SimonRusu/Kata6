package kata6.toys;

/**
 *
 * @author Entrar
 */

public class Car {
    final private Integer serialNumber;
    final String type = "car";
            
    public Car(Integer serialNumber){
        this.serialNumber = serialNumber;
    }
    
    public Integer getSerialNumber(){
        return serialNumber;
    }
    
    public String getType(){
        return type;
    }
    
    public void pack(){
        System.out.printf("Packing car '%d'\n", this.serialNumber);
    }
    
    public void label(){
         System.out.printf("Labelling car '%d'\n", this.serialNumber);       
    }
}
