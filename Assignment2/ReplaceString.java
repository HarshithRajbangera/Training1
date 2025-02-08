/*.Implement a function that replaces all occurrences of "hte" with "the" and "recieve" with "receive" in a given text.

Example 1:

Input:I saw hte email and will recieve the package tomorrow.

Output:I saw the email and will receive the package tomorrow.

Example 2:

Input:Please recieve hte message and confirm.

Output:Please receive the message and confirm.*/

package placement;

import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String input;
		
		System.out.println("Enter the input statement");
		input=sc.nextLine();
		
		input=input.replace("hte","the");
		input=input.replace("recieve","receive");
		
		System.out.println(input);

	}

}
