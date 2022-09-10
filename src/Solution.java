import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int[] nums = new int[]{4};
        int target = 3;
        String s = "ZY";
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        ListNode list1 = new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode list2 = new ListNode(1,new ListNode(3,new ListNode(4)));
        System.out.println(maxSumDivThree(nums));

    }
    public static int maxSumDivThree(int[] nums) {
        int[] mod1 = new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE};
        int[] mod2 = new int[]{Integer.MAX_VALUE,Integer.MAX_VALUE};
        int rs = 0;
        for (int i = 0;i < nums.length;i++)
        {
            rs += nums[i];
            if (nums[i] % 3 == 1)
            {
                if (nums[i] <= mod1[0])
                {
                    mod1[1] = mod1[0];
                    mod1[0] = nums[i];
                }
                else if (nums[i] < mod1[1])
                    mod1[1] = nums[i];
            }
            else if (nums[i] % 3 == 2)
            {
                if (nums[i] <= mod2[0])
                {
                    mod2[1] = mod2[0];
                    mod2[0] = nums[i];
                }
                else if (nums[i] < mod2[1])
                    mod2[1] = nums[i];
            }
        }
        if(rs % 3 == 2)
        {
            if (mod1[0] == Integer.MAX_VALUE && mod1[1] == Integer.MAX_VALUE)
                return rs - mod2[0];
            return Math.max(rs - mod2[0], rs - mod1[0] - mod1[1]);
        }
        else
        {
            if (mod2[0] == Integer.MAX_VALUE && mod2[1] == Integer.MAX_VALUE)
                return rs - mod1[0];
            return Math.max(rs - mod1[0], rs - mod2[0] - mod2[1]);
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}