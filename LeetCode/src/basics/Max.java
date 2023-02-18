package basics;

public class Max {

	public static void main(String[] args) {
		int[] arr = {1,3,55,8};
		System.out.println(max(arr));
	}
	static int max(int[] arr) {
		int maxVal= arr[0];
			for (int i= 0 ; i<arr.length ; i++) {
				if(arr[i]>maxVal) {
					maxVal=arr[i];
			}
		}
		return maxVal;
	}
}
