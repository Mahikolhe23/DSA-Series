package leetcode.tree;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class ArrayToBST {

	public static void main(String[] args) {

	}

	public TreeNode sortedArrayToBST(int[] nums) {
		return helper(nums, 0, nums.length - 1);
	}

	private TreeNode helper(int[] nums, int l, int r) {
		if (l > r)
			return null;
		int mid = (l + r) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = helper(nums, l, mid - 1);
		root.right = helper(nums, mid + 1, r);
		return root;
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
