public class Q1Solution {
	
	public static void main(String[] args) {
		
		//for printing i
		int n = 6;
		for(int row=0;row<n;row++)
		{
			for(int col=0;col<n;col++)
			{
				if( (row==0) || (row==n-1) || col==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				
					System.out.print(" ");
			}
			System.out.println();
		}
		//for printing N
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j==0)||(j==n-1)||(i==j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		
		}
		
	//for printing E
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==0 || i==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		
		}
		
		//for printing U

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j==0)||(j==n-1)||(i==n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
	}
		
		//for printing R
	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==0 || i==(n-1)/2 || j==(n-1) && i<=(n-1)/2 || i==j && i>=n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//for printing O

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(((i>=n/4 && (i<=(3*n)/4) && j==0) || (j>=n/4 && (j<=(3*n)/4) && i==0) ||
					(j==(n-1) && i>=n/4 && i<=(3*n)/4)) || ((i==n-1)&&(j>=n/4)&&(j<=(3*n)/4)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
	}
		
		
		//for printing N
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j==0)||(j==n-1)||(i==j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
		
}
}
}
