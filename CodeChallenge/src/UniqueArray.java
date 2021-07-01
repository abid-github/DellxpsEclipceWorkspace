import java.util.Arrays;

public class UniqueArray {

	public static void main(String[] arg) {

		int[] a = { 2,2, 7, 4,1, 4, 3, 3,4, };
		int[] r = new int[a.length];
		int index = 0;

		
		for (int i = 0; i < a.length; i++) {
			int flag = 0;
			for (int j = 0; j < i; j++) {
				
				if (a[i] == a[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				r[index] = a[i];
				index++;
			}
		}

		for ( int i=0; i<index; i++)
		{
			System.out.println(r[i]);
		}
		System.out.println(Arrays.toString(r));
	}

}
