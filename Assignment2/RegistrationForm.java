/*1.You are developing a user registration system for a website. The username entered by the user must follow these rules:

It should contain only alphanumeric characters (a-z, A-Z, 0-9).
It should start with a letter (not a number or special character).
It should be at least 5 characters long and at most 15 characters long.*/

package placement;

import java.util.Scanner;

public class RegistrationForm {
	
	public static boolean isValidUserName(String username) {
		
		char firstChar=username.charAt(0);
		
		if(!( ( (firstChar>='A')&& (firstChar<='Z') )||( (firstChar>='a')&& (firstChar<='z') ) )) {
			return false;
		}
		for(int i=0;i<username.length();i++) {
			char s=username.charAt(i);
			if(!( ( (s>='A')&& (s<='Z') )||( (s>='a')&& (s<='z') )||( (s>='0')&& (s<='9') ) )) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String name;
		
		System.out.println("Enter the name");
		name=sc.nextLine();
		int n=name.length();
		
		
		
		if( (n>5) && (n<15) && isValidUserName(name)) {
			
			System.out.println(name+" is a Valid input");
			 
		}
		else {
			System.out.println(name+" is a InValid input");
		}
	}

}
