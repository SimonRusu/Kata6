package kata6.toys;

public class Helicopter {
    final private Integer serialNumber;
    final String type = "helicopter";
            
    public Helicopter(Integer serialNumber){
        this.serialNumber = serialNumber;
    }
    
    public Integer getSerialNumber(){
        return serialNumber;
    }
    
    public String getType(){
        return type;
    }
    
    public void pack(){
        System.out.printf("Packing helicopter '%d'\n", this.serialNumber);
    }
    
    public void label(){
         System.out.printf("Labelling helicopter '%d'\n", this.serialNumber);       
    }
}
