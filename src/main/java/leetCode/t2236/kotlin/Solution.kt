package leetCode.t2236.kotlin

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun checkTree(root: TreeNode?): Boolean {
        return root?.`val` == (root?.left?.`val` ?: 0) + (root?.right?.`val` ?: 0)
    }
}