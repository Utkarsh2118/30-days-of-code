class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int current) {
        if (node == null) {
            return 0;
        }

        // Update current number
        current = current * 2 + node.val;

        // If leaf node, return value
        if (node.left == null && node.right == null) {
            return current;
        }

        // Recurse left and right
        return dfs(node.left, current) + dfs(node.right, current);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}