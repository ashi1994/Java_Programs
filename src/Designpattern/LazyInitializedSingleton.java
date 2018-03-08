/**
 * Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
 * Exception handling is also possible in method.
 */
package Designpattern;

public class LazyInitializedSingleton {

	  // private instance, so that it can be,accessed by only by getInstance() method
	 private static LazyInitializedSingleton instance;
	    
	  // private constructor
	    private LazyInitializedSingleton(){}
	    
	  //method to return instance of class
	    public static LazyInitializedSingleton getInstance(){
	        if(instance == null){
	        	// if instance is null, initialize
	            instance = new LazyInitializedSingleton();
	            //instance will be created at request time  
	        }
	        return instance;
	    }


public static void main(String...s) {
	System.out.println(instance);
	
}
}