package String;
class Main
 {
  public static void main(String args[]) 
  {
     String str = "this is a test";
     System.out.println(replaceCharAt(str,'c',5));
  }

  public static String replaceCharAt(String s,char c,int pos) 
  {
    return s.substring(0, pos) + c + s.substring(pos + 1);
  }
}
//this cs a test