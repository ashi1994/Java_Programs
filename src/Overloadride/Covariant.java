package Overloadride;
class Override
{
    private Object show()//WE CAN INCREASE ACCESSSIBILITY BUT NOT DECREAESES ie public-private not work
{

   return "hi";

}
}
class Covariant extends Override
{
    public  String show()
{

   return "hello";

}
public static void main(String...s)
{
	Covariant a=new Covariant();
    System.out.println(a.show());

}



}