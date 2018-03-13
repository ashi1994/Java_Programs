package Designpattern;
/**
 * Early Instantiation: creation of instance at load time.
 * Singleton pattern is used for logging, drivers objects, caching and thread pool.
 * Singleton pattern restricts the instantiation of a class and ensures that only 
 * one instance of the class exists in the java virtual machine
 * Singleton design pattern is used in core java classes also, for example java.lang.Runtime
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