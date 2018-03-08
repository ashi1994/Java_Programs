package Designpattern;
/**
 * Early Instantiation: creation of instance at load time.
 * 
 *
 */

public class EagerInitializedSingleton {
    
	// //Early, instance will be created at load time  
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid create object outside the class
    private EagerInitializedSingleton(){}

    //No need of getInstance method actually
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
    
    public static void main(String...s) {
    	System.out.println(instance);
}
}