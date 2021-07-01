package com.string;

public class CountDifferentSymbols {

	public static void main(String[] args) {

		// count vowels, consonants & special symbols in a String//

		String str = "I Love  YOU $=#@!*%'>? YOU LOVE ME";
		str = str.toUpperCase();
		str = str.replace(" ", "");
		//str.trim();
		str.strip();
		
		char[] sa = str.toCharArray();
		int vcount = 0;
		int concount = 0;
		int spcount = 0;

		for (int i = 0; i < sa.length; i++) {

			if (sa[i] >= 'A' && sa[i] <= 'Z')

			{
				if (sa[i] == 'A' || sa[i] == 'I' || sa[i] == 'O' || sa[i] == 'U' || sa[i] == 'E') {
					vcount++;
				}

				else {
					concount++;
				}
			}

			else

			{
				spcount++;

			}

		}

		System.out.println("vowels count = " + vcount);
		System.out.println("con count = " + concount);
		System.out.println("spl count = " + spcount);
		System.out.println(" ttl count = " + sa.length);

	}

}
