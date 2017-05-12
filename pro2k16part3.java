package hello;
import java.io.*;
public class pro2k16part3 
{
	
	char ch[][]={
			{'a','b','c','d','e'},
			{'f','g','h','i','j'},
			{'k','l','m','n','o'},
			{'p','q','r','s','t'},
			{'u','v','w','x','y'},
			{'z','!','@','#','$'}
				};

	public static void main(String[] args) throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(read);
		pro2k16part3 ob=new pro2k16part3();
		char chr;
		int i,len,n1;
		String	str,str1="";
		System.out.println("Enter 1 to encrypt or 2 to decrypt");
		n1=Integer.parseInt(br.readLine());
		switch(n1)
		{
		case 1:
			System.out.println("enter sentence");
			str=br.readLine();
			len=str.length();
			for(i=0;i<len;i++)
			{
				chr=str.charAt(i);
				if(chr>='a'&&chr<='z')
					ob.index(chr);
				else
					System.out.print(chr);
					
			}
			break;
		case 2:
			System.out.println("enter code");
			str=br.readLine();
			str=str+" ";
			len=str.length();
			for(i=0;i<len;i++)
			{
				chr=str.charAt(i);
				if(chr==' ')
					{	
						/*if((char)chr+1==' ')
							{
								System.out.print(" ");
								i++;
							}
						else
						{*/
							ob.word(str1);
							str1="";
						//}
					}
				else
					str1=str1+chr;
			}
			break;
			default:
				System.out.println("Invalid choice!");
		}
		
	}
		void index(char c)
		{
			int i,j;
			for(i=0;i<6;i++)
			{
				for(j=0;j<5;j++)
				
					if(c==ch[i][j])
						System.out.print(i+""+j+" ");
				}
		}
		void word(String s)
		{
			int temp=Integer.parseInt(s);
			int i,j;
			j=temp%10;
			i=temp/10;
			System.out.print(ch[i][j]+" ");
		}

	

}
