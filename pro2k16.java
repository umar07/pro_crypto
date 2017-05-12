package hello;
import java.util.*;
public class pro2k16 

{ //jumbling string with an array
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a message");
		String st=sc.nextLine();
		st=st+" ";//added space
		int p,k,len=st.length(),c=0,c1=0;
		char ch;
		String st1="";
		for(p=0;p<len;p++)//counts no. of words
		{
			ch=st.charAt(p);
			if(ch==' ')
				{
					c1++;
					st1="";
				}
			else
				st1=st1+ch;
		}
		String str[]=new String[c1];
		for(k=0;k<len;k++)//stores each word as element of array
		{
			ch=st.charAt(k);
			if(ch==' ')
			{
				str[c]=st1;
				c++;
				st1="";
			}
			else
				st1=st1+ch;
		}
		
		int l=str.length;
		for(int i=0;i<l;i++)//jumbles the array
		{
			int ri=(int)(Math.random()*l);
			String temp=str[i];
			str[i]=str[ri];
			str[ri]=temp;
		}
		for(int j=0;j<l;j++)//prints the jumbled string
		{
			System.out.print(str[j]+" ");
		}
		System.out.println();
		char temwo[];
		String temp;
		int l2;
		for(int i=0;i<l;i++)//runs the jumbled string array
		{
			if(i>0)
				System.out.print(" ");
			temp=str[i];
			 int l1=temp.length();
			temwo=new char[l1];
			for(int u=0;u<l1;u++)//stores elm. of jumbled string 1by1.
			{
				char ch1=temp.charAt(u);
				temwo[u]=ch1;
			}
			l2=temwo.length;
			for(int v=0;v<l2;v++)//jumbles each word
			{
				int ri1=(int)(Math.random()*l2);
				char tem=temwo[v];
				temwo[v]=temwo[ri1];
				temwo[ri1]=tem;
			}
			for(int x=0;x<l2;x++)//prints that each word
			{
				System.out.print(temwo[x]);
			}	
		}
	}

}
