class Solution {
    public int averageOfSubtree(TreeNode root) {
        int count = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            int avg = countNode(node);
            if (avg == node.val) {
                count++;
            }
            if (node.left != null) {
                q.offer(node.left);
            }
            if (node.right != null) {
                q.offer(node.right);
            }
        }
        return count;
    }

    private static int countNode(TreeNode point) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(point);
        int sum = 0;
        int size = 1;
        while (!q.isEmpty()) {
            int n = q.size();
            int temp = n;
            

            while (temp-- > 0) {
                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null) {
                    q.offer(node.left);
                    size++;
                }
                if (node.right != null) {
                    q.offer(node.right);
                    size++;
                }
            }    
        }    
        return (int) (sum / size);
    }
}