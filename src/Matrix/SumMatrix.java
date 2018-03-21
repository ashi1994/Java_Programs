package Matrix;

public class SumMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int[][] a={{1,2,3},{2,8,5},{6,12,56}};
		int[][] b={{2,55,77},{2,4,5},{98,34,44}};
		int[][] sum=new int[3][3];
		
		System.out.println("First Matrix");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Second Matrix");
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Multiplication of matrix");
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				sum[i][j]=a[i][j]+b[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
		

		
		
	}

}
