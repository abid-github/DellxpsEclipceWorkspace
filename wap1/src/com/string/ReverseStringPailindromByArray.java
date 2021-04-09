package com.string;

public class ReverseStringPailindromByArray {

	public static void main(String[] args) {

		String x = "Liril";
		x = x.toLowerCase();
		char[] xa = x.toCharArray();
		System.out.println(xa);

		char[] rev = new char[xa.length];

		/*
		 * int i = 0; while (i != xa.length)
		 */
		for (int i = 0; i < xa.length; i++) {
			rev[xa.length - 1 - i] = xa[i];
			// i++;
		}

		// i = 0;
		// while (i != xa.length)

		for (int j = 0; j < xa.length; j++) {

			if (rev[j] != xa[j]) {

				System.out.println("Not Palindromy");
				System.exit(0);

			}

		}

		System.out.println("Pailndromy");// pailindromy
		
		
		
		 StringBuilder sb = new StringBuilder();
		 
		 sb.append(rev); 
		
	

		/*
		 * String Result = Arrays.toString(rev);
		 * 
		 * System.out.println(Result);//[l,i,r,i,l]
		 * 
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * sb.append(rev); 
		 * String res = sb.toString();
		 * 
		 * System.out.println(sb); 
		 * 
		 * System.out.println(res); 
		 * 
		 * 
		 * 
		 * if (x.equals(res)) 
		 * {
		 * System.out.println("palindrom");
		 * 
		 * } 
		 * else 
		 * { System.out.println(" Not Palindrom"); }
		 */
	}

}
