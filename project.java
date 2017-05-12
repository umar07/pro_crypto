package hello;
import java.io.*;
public class project 
{
	char ch[][]={
			{'a','b','c','d','e'},
			{'f','g','h','i','j'},
			{'k','l','m','n','o'},
			{'p','q','r','s','t'},
			{'u','v','w','x','y'},
			{'z','!','@','#','$'}
				};

	String str[]={"AAAAA","AAAAB","AAABA","AAABB","AABAA","AABAB",
			"AABBA","AABBB","ABAAA","ABAAB","ABABA","ABABB",
			"ABBAA","ABBAB","ABBBA","ABBBB","BAAAA","BAAAB",
			"BAABA","BAABB","BABAA","BABAB","BABBA","BABBB",
			"BBBBB","BBABA"};
	
	char ch1[]={'a','b','c','d','e','f','g','h','i','j','k','l',
			'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	static int i,len,len1,n,n1,n2;
	static String str1,str2="";
	static char chr,chr1;
	public static void main(String[] args) throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(read);
		project ob=new project();
		System.out.println("Welcome to INDIAN SECRET SERVICE!\nHere,we facilitate you to "
				+ "use our 3 major Techniques of Encryption to protect your "
				+ "information from unwanted intruders or to decipher the same."
				+ "\nWe hope that you find it useful :)");
		System.out.println();
		System.out.println("Enter accordingly-\nTechnique-1\nTechnique-2\nTechnique-3");
		n=Integer.parseInt(br.readLine());
		switch(n)
		{
		case 1:
			System.out.println("Enter 1 to Encrypt your data or 2 to Decrypt it:");
			n1=Integer.parseInt(br.readLine());
			switch(n1)
			{
			case 1:
				System.out.println("Enter your Plaintext:");
				str1=br.readLine();
				str1=str1.toLowerCase();
				len=str1.length();
				System.out.println("Your Ciphertext is:");
				for(i=0;i<len;i++)
				{
					chr=str1.charAt(i);
					if(chr>='a'&&chr<='z')
						ob.index(chr);
					else
						System.out.print(chr);
						
				}
				break;
			case 2:
				System.out.println("Enter your Ciphertext:");
				str1=br.readLine();
				str1=str1+" ";
				len=str1.length();
				System.out.println("Your Plaintext is:");
				for(i=0;i<len;i++)
				{
					chr=str1.charAt(i);
					if(chr==' ')
						{	ob.word(str2);
							str2="";
						}
					else
						{
						if(chr=='.')
							System.out.print(" ");
						else
							str2=str2+chr;
						}
				}
				break;
				default:
					System.out.println("Invalid choice!");
					
			}
			break;
		case 2:
			System.out.println("Enter 1 to Encrypt your data or 2 to Decrypt it:");
			n1=Integer.parseInt(br.readLine());
			switch(n1)
			{
			case 1:
				System.out.println("Enter your Plaintext:");
				 str1=br.readLine();
				len=str1.length();
				str1=str1.toLowerCase();
				System.out.println("Your Ciphertext is:");
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
				System.out.println("Enter your Ciphertext:");
				str1=br.readLine();
				str1=str1+" ";
				String str3="";
				len=str1.length();
				System.out.println("Your Plaintext is:");
				for(i=0;i<len;i++)
				{
					chr=str1.charAt(i);
					if(chr==' ')
					{
						ob.sent(str3);
						str3="";
					}
					else
						{
						if(chr=='.')
							System.out.print(" ");
						else
							str3=str3+chr;
						}
				}
				break;
				default:
					System.out.println("Invalid choice!");
		
			}
			break;
		case 3:
			System.out.println("Enter your Text:");
			str1=br.readLine();
			len=str1.length();
			str1=str1.toLowerCase();
			System.out.println("Enter 1 to Encrypt your Text or 2 to Decrypt it:");
			 n1=Integer.parseInt(br.readLine());
			switch(n1)
			{
			case 1:
			{	
						System.out.println("Enter   1:for Key-1\n\t2:for Key-2\n\t3:for Key-3");
						 n2=Integer.parseInt(br.readLine());
						 System.out.println("Your Encrypted Text is:");
						switch(n2)
						{
						case 1://shift by 2 backwards...
							for(i=0;i<len;i++)
							{
								chr=str1.charAt(i);
								if(chr>='a'&&chr<='z')
								{
									if(chr=='a')
										chr1='y';
									else if(chr=='b')
										chr1='z';
									else
										chr1=(char)(chr-2);
									str2=str2+chr1;
								}
								else
									str2=str2+chr;
							}
							break;
						case 2://shift by 1 backwards..
							for(i=0;i<len;i++)
							{
								chr=str1.charAt(i);
								if(chr>='a'&&chr<='z')
								{
									if(chr=='a')
										chr1='z';
									else
										chr1=(char)(chr-1);
									str2=str2+chr1;
								}
								else
									str2=str2+chr;
							}
							break;
						case 3://shift by 2 forwards....
							for(i=0;i<len;i++)
							{
								chr=str1.charAt(i);
								if(chr>='a'&&chr<='z')
								{
									if(chr=='y')
										chr1='a';
									else if(chr=='z')
										chr1='b';
									else
										chr1=(char)(chr+2);
									str2=str2+chr1;
								}
								else
									str2=str2+chr;
							}
							break;
							default:
								System.out.println("Invalid choice!");
						}
						break;//break of bigger case 1
			}
			case 2://decode
			{
				System.out.println("Enter   1:for Key-1\n\t2:for Key-2\n\t3:for Key-3");
				 n2=Integer.parseInt(br.readLine());
				 System.out.println("Your Decrypted Text is:");
				switch(n2)
				{
				case 1://shift by 2 forwards...
					for(i=0;i<len;i++)
					{
						chr=str1.charAt(i);
						if(chr>='a'&&chr<='z')
						{
							if(chr=='y')
								chr1='a';
							else if(chr=='z')
								chr1='b';
							else
								chr1=(char)(chr+2);
							str2=str2+chr1;
						}
						else
							str2=str2+chr;
					}
					break;
				case 2://shift by 1 forwards..
					for(i=0;i<len;i++)
					{
						chr=str1.charAt(i);
						if(chr>='a'&&chr<='z')
						{
							if(chr=='z')
								chr1='a';
							else
								chr1=(char)(chr+1);
							str2=str2+chr1;
						}
						else
							str2=str2+chr;
					}
					break;
				case 3://shift by 2 backwards....
					for(i=0;i<len;i++)
					{
						chr=str1.charAt(i);
						if(chr>='a'&&chr<='z')
						{
							if(chr=='a')
								chr1='y';
							else if(chr=='b')
								chr1='z';
							else
								chr1=(char)(chr-2);
							str2=str2+chr1;
						}
						else
							str2=str2+chr;
					}
					break;
					default:
						System.out.println("Invalid choice!");

				}
			}
			break;//case2 ends
			}//switch ends
			System.out.println(str2);

			break;
			default:
				System.out.println("Invalid choice!");
	
		}
		System.out.println("\n\n");
		System.out.println("\"Thanks for contacting us!  Do visit again\"");
		System.out.println(":):):):):)");
	}
	void index(char c)
	{
		int i,j;
		for(i=0;i<6;i++)
		{
			for(j=0;j<5;j++)
			{
				if(c==ch[i][j])
					System.out.print(i+""+j+" ");
			}
		}
	}
	void word(String s)
	{
		int temp=Integer.parseInt(s);
		int i,j;
		j=temp%10;
		i=temp/10;
		System.out.print(ch[i][j]);
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
				
				System.out.print(ch1[i]);
		}
	}
}
