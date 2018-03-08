package Newfeature;
/*
 * Enums are introduced in JDK 1.5 onward.
 * Enums in java are mainly used for grouping similar kind of constants as a one unit. constants means static and final.
 */
class Enumcheck
{
  public enum Direction
  {
  EAST,WEST,NORTH,SOUTH
  }
	
public static void main(String...s)
{
	for(Direction dr:Direction.values())

	System.out.println(dr);
}

}