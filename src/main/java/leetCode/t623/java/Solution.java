package leetCode.t623.java;

class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        return add(root, val, depth, 1);
    }

    private TreeNode add(TreeNode root, int val, int depth, int currentDepth) {
        if (root == null) {
            return null;
        }

        if (currentDepth == depth - 1) {
            TreeNode lTemp = root.left;
            TreeNode rTemp = root.right;

            root.left = new TreeNode(val);
            root.right = new TreeNode(val);
            root.left.left = lTemp;
            root.right.right = rTemp;

            return root;
        }

        root.left = add(root.left, val, depth, currentDepth + 1);
        root.right = add(root.right, val, depth, currentDepth + 1);

        return root;
    }
}
