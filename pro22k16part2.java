package hello;

import java.util.Scanner;

public class pro22k16part2 {

	public static void main(String[] args) 
	{
		//string to binary   a dot shows end of each letter
		pro22k16part2 ob=new pro22k16part2(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a message");
		String str=sc.nextLine();
		int i,len,ascii,x;
		len=str.length();
		char ch;
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			ascii=(int)ch;
			if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
				{
					x=ob.bin(ascii);
					System.out.print(x+".");
				}
			else
				System.out.print(ch);
		}

	}
	int bin(int n)
	{
		String st="",st1="";
		while(n>0)
		{
			int r=n%2;
			st=st+Integer.toString(r);
			n=n/2;
		}
		int len=st.length();
		for(int i=len-1;i>=0;i--)
		{
			st1=st1+st.charAt(i);
		}
		int y=Integer.parseInt(st1);
		return(y);
	}

}
