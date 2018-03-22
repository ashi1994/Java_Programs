package Matrix;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,4,3},{44,42,4},{8,1,3}};
		int[][] b=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
