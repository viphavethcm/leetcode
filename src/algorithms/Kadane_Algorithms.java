package algorithms;

public class Kadane_Algorithms {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int cur = nums[0];
        int best = nums[0];
        for (int i = 0;i < nums.length;i++)
        {
            cur = Math.max(nums[i],cur + nums[i]);
            best = Math.max(cur,best);
        }
        return best;
    }
}
