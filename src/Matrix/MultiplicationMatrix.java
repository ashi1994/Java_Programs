package Matrix;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a={{1,2,3},{2,8,5},{6,12,56}};
		int[][] b={{2,55,77},{2,4,5},{98,34,44}};
		
		int[][] mul=new int[3][3];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				mul[i][j]=0;
				for(int k=0;k<3;k++){
					mul[i][j]+=a[i][k]*a[k][j];
				}
				System.out.print(mul[i][j]+"   ");
			}
			System.out.println();
	}

	}
	
}
