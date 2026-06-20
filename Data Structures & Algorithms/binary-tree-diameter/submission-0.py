# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    ans = 0
    def height(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        
        left = self.height(root.left)
        right = self.height(root.right)
        self.ans = max(left + right, self.ans)

        return max(left, right) + 1

    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.height(root)
        return self.ans
        