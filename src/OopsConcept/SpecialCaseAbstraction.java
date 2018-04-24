package OopsConcept;
/*If we not implement the defined method in extended class then it will give warning and ask to make extending
 * class as abstact
 *
 */

interface InterfaceClassOne
{
    void methodOne();
}
 
interface InterfaceClassTwo
{
    void methodTwo();
    void extraMethod();
}
 
class SpecialCaseAbstraction implements InterfaceClassOne, InterfaceClassTwo
{
    public void methodOne()
    {
        //method of first interface is implemented
    }
 
    //method of Second interface must also be implemented.
    //Otherwise, you have to declare this class as abstract.
 
    public void methodTwo()
    {
        //Now, method of Second interface is also implemented.
        //No need to declare this class as abstract
    }
    public void extraMethod() {
    	
    }
    //This class own method
    public void show(){
    	
    }
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
