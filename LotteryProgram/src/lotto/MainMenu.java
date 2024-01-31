package lotto;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		    System.out.print("Enter number of tickets: ");
		    Scanner numReader= new Scanner(System.in);
		    int num = numReader.nextInt();
		    System.out.println("Lottery Numbers: ");
		    System.out.println();
		    for(int i=0; i<num; i++)  
		    {  
		        int[] lottoNumber = getNumbers();
		        System.out.print(lottoNumber[0] + " " );
		        System.out.print(lottoNumber[1] + " " );
		        System.out.print(lottoNumber[2] + " " );
		        System.out.print(lottoNumber[3] + " " );
		        System.out.print(lottoNumber[4] + " " );
		        System.out.print(lottoNumber[5] + " " );
		        System.out.print("BONUS:(" + lottoNumber[6] + ")");
		        System.out.println();
		    }  

		}
	}
		    public static int[] getNumbers()
		    {
		        int[] lottoNumber = new int[7];
		        {  
		        lottoNumber[0] = (int) ((47 * Math.random()) + 1);  
		        lottoNumber[1] = (int) ((47 * Math.random()) + 1);  
		        lottoNumber[2] = (int) ((47 * Math.random()) + 1);  
		        lottoNumber[3] = (int) ((47 * Math.random()) + 1);  
		        lottoNumber[4] = (int) ((47 * Math.random()) + 1);  
		        lottoNumber[5] = (int) ((47 * Math.random()) + 1);
		        lottoNumber[6] = (int) ((27 * Math.random()) + 1);
		        }  
		        return lottoNumber;
		    }
	}


