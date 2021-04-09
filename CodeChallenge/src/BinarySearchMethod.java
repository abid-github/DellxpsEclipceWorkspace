
public class BinarySearchMethod {

	static int srchtgt(int arr[], int a) {

		int l = 0;
		int h = arr.length - 1;

		while (l <= h) {
			// int mid = (l + h) / 2;

			int mid = l + (h - l) / 2;

			if (a == arr[mid]) {
				return mid;
			}

			else if (a < arr[mid]) {

				h = mid - 1;
			}

			else {
				l = mid + 1;
			}

		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 4, 5, 8, 9, 10 };
		int a = 8;

		System.out.println(srchtgt(arr, a));

	}

}
