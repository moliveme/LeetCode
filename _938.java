class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}

public class _938 {

    public void rec(TreeNode root, int low, int high, int[] res) {
        if (root == null) {
            return;
        }
        //visit
        if ((root.val >= low) && (root.val <= high)) {
            res[0] += root.val;
        }
        rec(root.left, low, high, res);
        rec(root.right, low, high, res);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int[] res = new int[1];
        rec(root, low, high, res);
        return res[0];
    }
}