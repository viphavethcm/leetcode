import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        String s = "MCMXCIV";
        int x = 7;
        System.out.println(countBits(x));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int x = 1; x <= n; ++x) {
            int a = x & (x - 1);
            ans[x] = ans[x & (x - 1)] + 1;
        }
        return ans;
    }

}
