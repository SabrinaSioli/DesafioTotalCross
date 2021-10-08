import java.io.CharArrayReader;

// Link: https://edabit.com/challenge/JmuM2cP5MvruRjr6c
public class AtbashCipher {
	public static String atbash(String str) {
		String alphab = "abcdefghijklmnopqrstuvwxyz";
		String str2 = "";
		for (int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			int j = 0;
			if (Character.isLowerCase(c)) {
				j = 25 - alphab.indexOf(c);
				str2 += alphab.charAt(j);
			} else if (Character.isUpperCase(c)) {
				j = 25 - alphab.indexOf(Character.toLowerCase(c));
				str2 += Character.toUpperCase(alphab.charAt(j));
			} else {
				str2 += c;
			}
		}
		return str2;
	}

	public static void main(String[] args) {
		System.out.println(atbash("apple"));
		System.out.println(atbash("Hello world!"));
		System.out.println(atbash("Christmas is the 25th of December"));
	}

}

