package company;

public class DocumentContentDiffYear {
	// how many times the year is present in string
	public static void main(String[] args) {
		String s = "UN was Establish 24-10-1996 and india got freedom 15-08-1947";
		System.out.println(countYear(s));
	}

	public static int countYear(String s) {
		int c = 0;
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i].charAt(arr[i].length() - 1)))
				c++;
		}
		return c;
	}
}
