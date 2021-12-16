package Day1;
import java.util.Scanner;

public class MatrixMultiplication {

		public static void main(String args[])
		{
		int row1, row2,col1,col2,i,j,k,sum;
		Scanner in = new Scanner(System.in);
		 
		System.out.println("Enter the number of rows of matrix1");
		row1 = in.nextInt();
		 
		System.out.println("Enter the number columns of matrix 1");
		col1 = in.nextInt();
		System.out.println("Enter the number of rows of matrix2");
		row2 = in.nextInt();
		 
		System.out.println("Enter the number of columns of matrix 2");
		col2 = in.nextInt();
		 
		if(col1==row2)
		{
		 
		int matrix1[][] = new int[row1][col1]; 
		int matrix2[][] = new int[row2][col2]; 
		int product[][] = new int[row1][col2];
		 
		System.out.println("Enter the elements of matrix1");
		 
		for ( i= 0 ; i < row1 ; i++ )
		{ 
		 
		for ( j= 0 ; j < col1 ;j++ )
		matrix1[i][j] = in.nextInt();
		 
		}
		System.out.println("Enter the elements of matrix2");
		 
		for ( i= 0 ; i < row2 ; i++ )
		{ 
		 
		for ( j= 0 ; j < col2 ;j++ )
		matrix2[i][j] = in.nextInt();
		 
		}
		 
		System.out.println("\n\noutput matrix:-");
		for ( i= 0 ; i < row1 ; i++ )
		 
		for ( j= 0 ; j <col2;j++)
		{
		sum=0;
		for ( k= 0 ; k <row2;k++ )
		{
		sum +=matrix1[i][k]*matrix2[k][j] ;
		 
		}
		product[i][j]=sum;
		}
		for ( i= 0 ; i < row1; i++ )
		{
		for ( j=0 ; j < col2;j++ )
		System.out.print(product[i][j]+" ");
		 
		System.out.println();
		}
		}
		else
		System.out.print("multipication does not exist ");
		}
		 
		}





