package toyproduct.models;

import toyproduct.Toy;

public class AsianCarToy implements Toy{
    final private Integer serialNumber;
    final String type = "car";
            
    public AsianCarToy(Integer serialNumber){
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
        System.out.printf("Packing car '%d'\n", this.serialNumber);
    }
    
    @Override
    public void label(){
         System.out.printf("Labelling car '%d'\n", this.serialNumber);  
    }
    
    @Override
    public String toString(){
        return "AsianCarToy{" + "serialNumber" + serialNumber + '}';
    }
}
