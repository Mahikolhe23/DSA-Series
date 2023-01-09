package basic;
import java.util.Arrays;
public class SingleNumber {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(singleNumber(nums));
	}
	public static boolean singleNumber(int[] nums) {
		 Arrays.sort(nums);
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j]==nums[j+1]) {
					return true;
				  }
				}
	        return false;
    }
}
