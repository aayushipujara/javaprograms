import java.util.Scanner;
	
	public class u1p10_1
	{
		public static void main(String args[])
		{
			int scores[]=new int[5];
			
			scores[0]=90;
			scores[1]=70;
			scores[2]=80;
			scores[3]=95;
			scores[4]=85;
			System.out.println("Manually assigned array elements");
			for (int i=0;i<scores.length;i++)
			{
				System.out.print(scores[i]+" ");
			}
		}
	}