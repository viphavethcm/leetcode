import java.util.*;

public class Solution {
    public static void main(String[] args) {

        int[] nums = new int[]{1,1,-1,-1,3};
        int target = 3;
        String s = "273";
//        TreeNode p = new TreeNode(1,new TreeNode(2),null);
//        TreeNode q = new TreeNode(1,null,new TreeNode(2));

        TreeNode p = new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),new TreeNode(5));
        TreeNode q = new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),new TreeNode(5));
        System.out.println(isSameTree(p,q));
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (!check(p,q))
            return false;
        ArrayDeque<TreeNode> deqP = new ArrayDeque<>();
        ArrayDeque<TreeNode> deqQ = new ArrayDeque<>();
        deqP.addLast(p);
        deqQ.addLast(q);
        while (!deqP.isEmpty())
        {
            p = deqP.removeFirst();
            q = deqQ.removeFirst();
            if (!check(p.left,q.left))
                return false;
            if (p.left != null)
            {
                deqP.addLast(p.left);
                deqQ.addLast(q.left);
            }
            if (p.right != null)
            {
                deqP.addLast(p.right);
                deqQ.addLast(q.right);
            }
        }
        return true;
    }

    public static boolean check(TreeNode p, TreeNode q)
    {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        return true;
    }
}
