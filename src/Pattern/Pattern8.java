package Pattern;
class Pattern8
 {

public static void main(String...s)
{

 int i,j;
 for (i=1; i<=7; i++) 
 {
 for (j=1; j<=i; j++) 
 {
 if (j==1) { // Applying the condition
 System.out.print(" 1");
 } 
 else
  {
 System.out.print(" 0");
 }
 }
 System.out.println();
 }
 for (i=6; i>=1; i--)
  { 
  //As it shares the same base i=6
 for (j=1; j<=i; j++) 
 {
 if (j==1) 
 { // Applying the condition
 System.out.print(" 1");
 } else
  {
System.out.printf(" 0");
 }
 }
 System.out.println();
 }
 }
 }
/*
 1
 1 0
 1 0 0
 1 0 0 0
 1 0 0 0 0
 1 0 0 0 0 0
 1 0 0 0 0 0 0
 1 0 0 0 0 0
 1 0 0 0 0
 1 0 0 0
 1 0 0
 1 0
 1

 */