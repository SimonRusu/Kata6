package toyproduct.models;

import toyproduct.Toy;
/**
 *
 * @author Simon
 */
public class AmericanSubmarineToy implements Toy{
    final private Integer serialNumber;
    final String type = "submarine";
            
    public AmericanSubmarineToy(Integer serialNumber){
        this.serialNumber = serialNumber;
    }
    
    @Override
    public Integer getSerialNumber(){
        return serialNumber;
    }
    
    public String getType(){
        return type;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing submarine '%d'\n", this.serialNumber);
    }
    
    @Override
    public void label(){
         System.out.printf("Labelling submarine '%d'\n", this.serialNumber);       
    }
    @Override
    public String toString(){
        return "AmericanSubmarineToy{" + "serialNumber" + serialNumber + '}';
    }
}
