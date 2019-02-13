package Cars.models;

/**
 *
 * @author Kristev
 */
public class Nissan extends Car {

    /**
     * Default constructor;
     */
    public Nissan(){
           System.out.println("Nissan constructor is called");
        //  set the name to Nissan
      name = "Nissan";
      // set the number of wheels to 4
      numberOfWheels = 4;
      // set the number of doors to 5
      numberOfDoors = 5;
        
    }
    /**
     * Parameterized constructor;
     * @param model 
     */
    public Nissan(String model){
        subModel = model;
        
    }
    
    
    public void runVeryFast() {
        consumeFuel();
        consumeFuel();
    }
    

}
