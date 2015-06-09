package ch1_array_string;
import java.util.Scanner;
import java.util.Arrays;

public class _1_3_Permutation {
	public static void main(String[]arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first string:");
		String str1 = sc.nextLine();
		System.out.println("Please enter the second string:");
		String str2 = sc.nextLine();
		sc.close();
		if(Permutation2(str1,str2)) 
			System.out.println("They are permutation!");
		else
			System.out.println("They are not permutation!");
	}
	public static boolean Permutation1(String a, String b){
		if(a.length()!=b.length()) return false;
		char[] content = a.toCharArray();
		char[] content2 = b.toCharArray();
		//sort the two char array
		Arrays.sort(content);
		Arrays.sort(content2);
		return Arrays.equals(content,content2);
	}
	public static boolean Permutation2(String a, String b){
		//if the two strings differ in length, they are not permutation
		if(a.length()!=b.length()) return false;
		//create an array to store the counts of each char
		int[] char_count =new int[256];
		//transfer string into array, one char one element
		char[] content = a.toCharArray();
		//count each char,put the value into an array by char(ASCII)
		for(char c : content){
			char_count[c]++;
		}
		for(int i=0;i<b.length();i++){
			int d = b.charAt(i);
			System.out.println(char_count[d]);
			//if they are not permutation, there must be one or more char that str2 has more than str1
			if(char_count[d]<1){
				char_count[d]--;
				return false;
			}
		}
		return true;
	}
}
