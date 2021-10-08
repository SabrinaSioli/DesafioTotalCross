//Atbash Cipher
// Link: https://edabit.com/challenge/JmuM2cP5MvruRjr6c

public class AtbashCipher {
	public static String atbash(String str) {
		String alphab = "abcdefghijklmnopqrstuvwxyz"; //string with all letters in the alphabet
		String str2 = "";
		for (int i=0; i<str.length(); i++) { 
			char c = str.charAt(i); //in each iteracion I save one Charactere of the 'str'
			int j = 0;
			/*
			To get the mirror letter of 'a' I can look the index of 'a' in the string 'alphab' and subtract
			25 (there are 26 letters in the alphabet, but our array starts with 0, so I need use 25).
			25 less 0 is 25, so the mirror letter is the character with index 25, i.e z

			The logic is the same with the letters in upper case, just need to transforme the Character to upper case.
			*/
			if (Character.isLowerCase(c)) { //test if the character is in lower case 
				j = 25 - alphab.indexOf(c); // subtraction to get the index of the mirror letter
				str2 += alphab.charAt(j); //save the mirror letter 
			} else if (Character.isUpperCase(c)) { //test if the character is in uppercase 
				j = 25 - alphab.indexOf(Character.toLowerCase(c)); //the same subtration, but it is necessary use the method "toLowerCase"
				str2 += Character.toUpperCase(alphab.charAt(j)); //save the mirror letter, note that it was used the method "toUpperCase" 
			} else { // special characters
				str2 += c; 
			}
		}
		return str2;
	}

	public static void main(String[] args) {
		//Tests
		System.out.println(atbash("apple"));
		System.out.println(atbash("Hello world!"));
		System.out.println(atbash("Christmas is the 25th of December"));
	}

}

