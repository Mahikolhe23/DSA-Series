package assignment.array;

public class MountainArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,4,3,2};
		int ans = peakIndexInMountainArray(arr);
		System.out.println(ans); 
	}
	public static int peakIndexInMountainArray(int [] arr) {
		int start =0;
		int end = arr.length-1;
		while(start<end) {
			int mid= start+(end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				//you are in decreasing part of array
				//this may be the ans , but looked at the left
				//this is why end!=mid-1
				end=mid;
			}
			else {
				//you are in increasing part of array
				//because we know that mid+1 element >mid element
				start = mid+1; 			
			}
		}
		//in the end start == end and pointing to the largest number because of the 2 checks above
		//start and end always find  max element 
		return start;
	}
}
