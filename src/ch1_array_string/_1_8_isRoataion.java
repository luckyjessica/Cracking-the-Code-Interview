package ch1_array_string;

import java.util.Scanner;

public class _1_8_isRoataion {
	public static boolean isRotation(String s1,String s2){
		if(s1.length()!=s2.length())
			return false;
		else{
			String s1s1=s1+s1;
			return isSubstring(s1s1,s2);
		}
	}
	public static boolean isSubstring(String s1, String s2){
		return s1.indexOf(s2)==-1? false:true;
	}
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=sc.nextLine();
		System.out.println("Enter the sub string");
		String s2=sc.nextLine();
		sc.close();
		System.out.println(isRotation(s1,s2)?"Yes":"No");
	}
}
