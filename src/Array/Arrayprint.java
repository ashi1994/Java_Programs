package Array;

public class Arrayprint {
	
	public static void printAraay(char ch[]){
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] ch={'a','b','A'};
        printAraay(ch);	
        char ch1='A';
        int ascii=(Character)ch1;
        System.out.println(ascii);

	}
}

