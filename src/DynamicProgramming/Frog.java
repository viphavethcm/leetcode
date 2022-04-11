package DynamicProgramming;

import java.util.Arrays;

public class Frog {
    public static void main(String[] args) {
        int[] ar = {1, 9, 2, 10, 4};
        int n = 5;
        System.out.println(solve(ar,n));
    }

    public static int solve(int[] ar, int n)
    {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1;i < n;i++)
        {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 0;i < n;i++){
            for (int j = i+1;j <= i+2;j++)
            {
                if (j < n)
                {
                    dp[j] = Math.min(dp[j],dp[i] + Math.abs(ar[i] - ar[j]));
                }
            }
        }
        return dp[n-1];
    }
}
