class Assignment_1
{
	public static void main(String[] args)
	{
		int cnt;
		for(int i=0;i<args.length;i++)
		{
			cnt=0;
			int num=0;
			num=Integer.parseInt(args[i]);
			
			for(int j=1;j<=num;j++)
			{
				if(num%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				System.out.println(num+" number is Prime");
					System.out.println("Table of "+num);
				for(int k=1;k<=10;k++)
				{
					System.out.println(num*k);
				}
				System.out.println();
			}
			else
			{
				System.out.println(num+" is not prime after divide by 10 is "+num/10);
				System.out.println();
			}
		}
	}
}