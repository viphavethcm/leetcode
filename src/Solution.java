import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        else if (nums.length == 2)
            return Math.max(Math.max(nums[0],nums[1]),nums[0] + nums[1]);
        int sum = nums[0] + nums[1];
        for (int i = 2;i < nums.length -1;i++)
        {
            sum = Math.max(sum + nums[i],nums[i]);
        }
        return sum;
    }

}
