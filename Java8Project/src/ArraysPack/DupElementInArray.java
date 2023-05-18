package ArraysPack;

public class DupElementInArray {

	public static void main(String[] args) {

		int  arr[]= {1,2,26,3,2,4,1,4,8,5,26};
		System.out.print("Duplicate elements : " + getDupChar(arr));

	}

	public static String getDupChar(int[] arr) {
		String res = "";
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '*';
				}
			}
			if (count > 1 && arr[i] != '*') {
				res += arr[i] + " ";
			}
		}
		return res;
	}

}
