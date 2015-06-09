package ch1_array_string;
import java.util.Scanner;

public class _1_4_ReplaceSpaces {
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String str = sc.nextLine();	
		System.out.println("The string after replacement is:");
		ReplaceSpaces(str,3);
		sc.close();
		char[] ch=new char[30];  
        ch[0]='a';  
        ch[1]='b';  
        ch[2]=' ';  
        ch[3]=' ';  
        ch[4]='c';  
        trans(ch, 35); 
	}
	
	public static void ReplaceSpaces(String s, int chosn){
		//two methods, the first one is just to use String.replace method,but it need a new string copy in space,
		//because String is immutable, it is marked as final when created.
		if(chosn==1){
			String nw = s.replace(" ","%20");
			System.out.println(nw);	
		}		
		else {
			char[] char_array = s.toCharArray();
			int count=0;
			for(char i : char_array){
				if(i==' ') count++;
			}
				//the second method is to change the string into Char array first for manipulation,
				//but it create a new one char[] either, so not efficient in space.
				char[] newone = new char[s.length() + 2*(count++)];
				System.out.println(newone.length);
				for(int i=0,b=0;i<s.length();i++){
					if(char_array[i]!=' '){
						newone[b] = char_array[i];
						b++;
					}
					else{
						newone[b] = '%';
						newone[b+1] = '2';
						newone[b+2] = '0';
						b=b+3;
					}
				}
				System.out.println(newone);
			}
	}	
			//this method operates the original char_array, space efficiently
			//but in this one, the ch array should have enough buffer space in initialization 
	        //which will not cause overwrite after replace spaces. 
			public static void trans(char[] ch, int length){  
		        int spaceCount=0,newLength=0;  
		        for(int i=0;i<length;i++){  
		            if(ch[i]==' ') spaceCount++;  
		        }  
		        newLength=length+2*spaceCount;  
		        ch[newLength]='\0';  
		        for(int i=length-1;i>0;i--){  
		            if(ch[i]==' '){  
		                ch[newLength-1]='0';  
		                ch[newLength-2]='2';  
		                ch[newLength-3]='%';  
		                newLength=newLength-3;  
		            }else{  
		                ch[newLength-1]=ch[i];  
		                newLength--;  
		            }  
		        }   
		        System.out.println(ch);  
		        }  
}
