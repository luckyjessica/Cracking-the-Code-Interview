package ch1_array_string;
import java.util.Scanner;

public class _1_1_UniqueChar {
		public static void main(String[] arg){
			System.out.println("Please enter an string:");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			System.out.println(s.length());
			if(isUniqueChar(s)) 
				System.out.println("There are all unique charater in the string!");
			else
				System.out.println("There is no unique charater in the string!");
			sc.close();
		}
		
		public static boolean isUniqueChar(String str){
			boolean[] char_storage = new boolean[256];
			for(int i=0;i<str.length();i++){
				int val = str.charAt(i);
				if(char_storage[val])
					return false;
				char_storage[val]=true;
			}
			return true;
		}
		
		//字符集只是a-z(或是A-Z)
		public static boolean isUniqueChars2(String str){
			int checker=0;
			for(int i=0;i<str.length();++i){
				int val=str.charAt(i)-'a';
				if((checker&(1<<val))>0) return false;
				checker|=(1<<val);
			}
			return true;
		}

}
