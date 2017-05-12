package hello;
import java.io.*;
public class pro2k16part4 
{
	String str[]={"AAAAA","AAAAB","AAABA","AAABB","AABAA","AABAB",
			"AABBA","AABBB","ABAAA","ABAAB","ABABA","ABABB",
			"ABBAA","ABBAB","ABBBA","ABBBB","BAAAA","BAAAB",
			"BAABA","BAABB","BABAA","BABAB","BABBA","BABBB",
			"BBBBB","BBABA"};
	
	char ch1[]={'a','b','c','d','e','f','g','h','i','j','k','l',
			'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	
	public static void main(String[] args) throws IOException
	{ 
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(read);
		pro2k16part4 ob=new pro2k16part4();
		int i,len,n1;
		char chr;
		String str1;
		System.out.println("Enter 1 to encrypt and 2 to decrypt");
		n1=Integer.parseInt(br.readLine());
		switch(n1)
		{
		case 1:
			System.out.println("enter string");
			 str1=br.readLine();
			len=str1.length();
			for(i=0;i<len;i++)
			{
				chr=str1.charAt(i);
				if(chr>='a'&&chr<='z')
					ob.code(chr);
				else
					System.out.print(chr+" ");
			}
			System.out.println();
			break;
		case 2:
			System.out.println("enter code");
			str1=br.readLine();
			str1=str1+" ";
			String str3="";
			len=str1.length();
			for(i=0;i<len;i++)
			{
				chr=str1.charAt(i);
				if(chr==' ')
				{
					ob.sent(str3);
					str3="";
				}
				else
					str3=str3+chr;
			}
			break;
			default:
				System.out.println("invalid choice");
	
		}
		
		
	}
	void code(char c)
	{
		int i;
		for(i=0;i<26;i++)
		{
			if(ch1[i]==c)
				System.out.print(str[i]+" ");
		}
	}
	void sent(String s)
	{
		int i;
		for(i=0;i<26;i++)
		{
			if(str[i].equals(s))
				
				System.out.print(ch1[i]+" ");
		}
	}
	
	
	

}
