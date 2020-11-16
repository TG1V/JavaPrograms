package trishagun;

import javax.swing.*;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "way";
		String str2 = "ay";
		String pigword;
		String[] vowels = { "a", "e", "i", "o", "u" };
		String splitword = "";
		String firstLetter = "";
		int index = 0;
		
		//User input
		String word1 = JOptionPane.showInputDialog("Enter a word " + ": ");
		// first step -- convert to lower case
		word1 = word1.toLowerCase();


		String split = "";
		String letter1 = "";
		int j = 0;
		while (j < word1.length()) {
			String singleLetter = String.valueOf(word1.charAt(j)); // retrieve single letter of String word1 //o

			index = j;

			for (int k = 0; k < vowels.length; k++) {
				if (!vowels[k].contains(singleLetter) && j == 0) {
					firstLetter = singleLetter;
				} else if (vowels[k].contains(singleLetter) && j == 0) {
					pigword = word1.concat(str1);
					JOptionPane.showMessageDialog(null,"The Pig Latin word of "+word1+" is "+pigword);
					k = vowels.length;
					j = word1.length();
				} else if (vowels[k].contains(singleLetter) && j > 0) {
					splitword = word1.substring(index);
					String concatenate = splitword.concat(letter1);
					String mystr = concatenate.concat(str2);

					JOptionPane.showMessageDialog(null,"The Pig Latin word of "+word1+" is "+mystr);

					//System.out.println(mystr);
					k = vowels.length;
					j = word1.length();
				}

			}
			letter1 = letter1.concat(singleLetter);
			j++;

		}

	}
}
