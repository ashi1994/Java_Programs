package LoopCaseCondition;

public class EnumInSwitchCase {

	enum direction {
		south,west,east,north}
	public static void print(direction dr){
		switch(dr){
		case east:
			System.out.println("east direction");
			
		case south:
			System.out.println("south direction");
		
		case west:
			System.out.println("west direction");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(direction str:direction.values()){
			System.out.println(str);
		}
		

		
	}

}
