/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean lr = true;

        while(!q.isEmpty()){
            List<Integer> curlist = new ArrayList<>();
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode cur = q.poll();
                if(lr){
                    curlist.addLast(cur.val);
                }
                else{
                    curlist.addFirst(cur.val);
                }

                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);

            }
            res.add(curlist);
            lr=!lr;
        }

        return res;
        
    }
}