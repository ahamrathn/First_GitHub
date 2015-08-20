package com.example.numbertoword;

public class Conversion {
	
	
	public static String once[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
	
	public static String tens[]={"zero","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	
	public static String spl[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	
	public static String grade[]={" ","one","ten","hundred","thousand "," ","hundred "," million"};
	
	public int given[];
	
	int length;
	
	public String value;
	public String get="";
	
	public int flag=0;
	String convert(int x )
	{
		
		String temp = Integer.toString(x);
		length = temp.length();
		
		given= new int[length];

		for(int i=0;i<temp.length();i++)
		{
			given[i]=temp.charAt(i)-'0';
			
		}
		
		int digit;
		for(int i =0;i<length;i++)
		{
			digit=length-i;
			
			if(given[i]!=0)
			{
				if((digit==5)||(digit==2))
				{
					
					if(given[i]==1)
					{
						flag=1;
						value="";	
					}
					else
					{
						value=tens[given[i]]+" ";
					
					}
					
				}
				else
				{
					if(flag==1)
					{
						value=spl[given[i]]+" ";
						flag=0;
					}
					else
					{
						value=once[given[i]]+" ";
						
					}
					if((digit==3)||(digit==4)||(digit==7)||(digit==6))
					{
						value=value+grade[digit];
					}
					
				}
				get=get+" "+value+" ";
				
				
			}
		
		}
		
		
		
		return get;
	}
	

}
