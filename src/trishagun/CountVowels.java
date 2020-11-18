package trishagun;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String input = sc.nextLine();
		
		//convert to char array
		char [] arr = input.toCharArray();
		int counta =0, counte =0, counti=0, counto= 0, countu = 0;
	
		for (int i =0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		switch (input.charAt(i)) {
		case 'a':
			counta++;
			break;
		case 'e':
			counte++;
			break;
		case 'i':
			counti++;
			break;
		case 'o':
			counto++;
			break;
		case 'u':
			countu++;
			break;
		default:
			continue;
			
		}
		
		}
		
		if (counta==0 && counte==0 && counti==0 && counto==0 && countu==0)
		{
			System.out.println("There are no vowels in '"+input+"'");
		}
		else if (counta > 0 || counte > 0 || counti > 0 || counto > 0 || countu > 0)
		{
			System.out.println("The count of vowels in " +input+" is");
			System.out.println("The number of 'a' is "+counta);
			System.out.println("The number of 'e' is "+counte);
			System.out.println("The number of 'i' is "+counti);
			System.out.println("The number of 'o' is "+counto);
			System.out.println("The number of 'u' is "+countu);
		}
		
	}

}
