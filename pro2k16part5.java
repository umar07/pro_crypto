package hello;
import java.io.*;
public class pro2k16part5 {

	public static void main(String[] args) throws IOException
	{
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(read);
		String str2="";
		int i,len,n1,n2;
		char ch,chr;
		System.out.println("enter string");
		String str1=br.readLine();
		len=str1.length();
		System.out.println("1 to encode\n2 to decode");
		 n1=Integer.parseInt(br.readLine());
		switch(n1)
		{
		case 1:
		{	
					System.out.println("enter   1:for key1\n\t2:for key2\n\t3:for key3");
					 n2=Integer.parseInt(br.readLine());
					switch(n2)
					{
					case 1://shift by 2 backwards...
						for(i=0;i<len;i++)
						{
							ch=str1.charAt(i);
							if(ch>='a'&&ch<='z')
							{
								if(ch=='a')
									chr='y';
								else if(ch=='b')
									chr='z';
								else
									chr=(char)(ch-2);
								str2=str2+chr;
							}
							else
								str2=str2+ch;
						}
						break;
					case 2://shift by 1 backwards..
						for(i=0;i<len;i++)
						{
							ch=str1.charAt(i);
							if(ch>='a'&&ch<='z')
							{
								if(ch=='a')
									chr='z';
								else
									chr=(char)(ch-1);
								str2=str2+chr;
							}
							else
								str2=str2+ch;
						}
						break;
					case 3://shift by 2 forwards....
						for(i=0;i<len;i++)
						{
							ch=str1.charAt(i);
							if(ch>='a'&&ch<='z')
							{
								if(ch=='y')
									chr='a';
								else if(ch=='z')
									chr='b';
								else
									chr=(char)(ch+2);
								str2=str2+chr;
							}
							else
								str2=str2+ch;
						}
						break;
						default:
							System.out.println("Invalid choice!!");
					}
					break;//break of bigger case 1
		}
		case 2://decode
		{
			System.out.println("enter   1:for key1\n\t2:for key2\n\t3:for key3");
			 n2=Integer.parseInt(br.readLine());
			switch(n2)
			{
			case 1://shift by 2 forwards...
				for(i=0;i<len;i++)
				{
					ch=str1.charAt(i);
					if(ch>='a'&&ch<='z')
					{
						if(ch=='y')
							chr='a';
						else if(ch=='z')
							chr='b';
						else
							chr=(char)(ch+2);
						str2=str2+chr;
					}
					else
						str2=str2+ch;
				}
				break;
			case 2://shift by 1 forwards..
				for(i=0;i<len;i++)
				{
					ch=str1.charAt(i);
					if(ch>='a'&&ch<='z')
					{
						if(ch=='z')
							chr='a';
						else
							chr=(char)(ch+1);
						str2=str2+chr;
					}
					else
						str2=str2+ch;
				}
				break;
			case 3://shift by 2 backwards....
				for(i=0;i<len;i++)
				{
					ch=str1.charAt(i);
					if(ch>='a'&&ch<='z')
					{
						if(ch=='a')
							chr='y';
						else if(ch=='b')
							chr='z';
						else
							chr=(char)(ch+2);
						str2=str2+chr;
					}
					else
						str2=str2+ch;
				}
				break;
				default:
					System.out.println("not valid!!");

			}
		}
		break;//case2 ends
		}//switch ends
		System.out.println(str2);
	}//mm ends
}//class ends
