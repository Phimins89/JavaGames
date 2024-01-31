package com.puzzle;

public class MainClass {
	
	public static final int HEIGHT = 4;
	public static final int WIDTH  = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[HEIGHT][WIDTH];
		
		 for(int i = 0; i < HEIGHT; i++){
			 for (int j = 0; j < WIDTH; j++){
				 array[i][j] = i * WIDTH + (j + 1);
		         System.out.print(array[i][j] + " ");
		      } 
			 System.out.println();
		 }
		 System.out.println();
		 int i, sRow, eRow, sCol, eCol;
		 sRow = 0;
		 sCol = 0;
		 eRow = HEIGHT;
		 eCol = WIDTH;
		 
		while(sCol < eCol && sRow < eRow){
			System.out.print("Right - "); 
			 for (i = sCol;i < eCol;i++){
				 System.out.print(array[sRow][i] + " ");
			 }
			 sRow++;
			 System.out.println();
			 System.out.print("Down - "); 
			 for (i = sRow;i < eRow; i++){
				 System.out.print(array[i][eRow] + " ");
			 }
			 eCol--;
			 System.out.println();
			 System.out.print("Left - ");
			 for (i = eCol;i > sCol;i--){
				 System.out.print(array[eRow-1][i-1] + " ");
			 }
			 eRow--;
			 System.out.println();
			 System.out.print("Up - ");
			 for (i = eRow;i > sRow;i--){
				 System.out.print(array[i-1][sCol] + " ");
			 }
			 sCol++;
		}
		 
		 
	}

}
