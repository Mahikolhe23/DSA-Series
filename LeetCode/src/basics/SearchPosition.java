package basics;

public class SearchPosition {

	public static void main(String[] args) {
		int[] nums = {1,3,5,6}; 
		int target = 2;
		int ans = searchInsert(nums,target);
		System.out.println(ans);
	}
	static public int searchInsert(int[] nums, int target) {
		int ans=0;
		for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
                ans=i;
            if(nums[i]<target)
            	ans=i+1;
        }
		return ans;
    }
}
