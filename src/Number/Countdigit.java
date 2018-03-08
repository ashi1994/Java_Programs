package Number;
class Countdigit
{
	public static void main(String...s)
	{
		/*
        int a=234;
        String s1=String.valueOf(a);
        int len=s1.length();
        System.out.println(len);
        */
          int count=0;
        int n=234356;
        while(n>0)
        {
              n=n/10;
              count++;
        }
        System.out.println(count);
	}
}
