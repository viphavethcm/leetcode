package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BackTracking {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));

    }
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> rs = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        for (int num : nums) {
            permutation.add(num);
        }
        solve(nums.length,permutation,rs,0);
        return null;
    }

    public static void solve(int n,List<Integer> permu,List<List<Integer>> rs , int first)
    {
        if (first == n)
            rs.add(new ArrayList<Integer>(permu));
        for (int i = first; i < n; i++) {
            // place i-th integer first
            // in the current permutation
            Collections.swap(permu, first, i);
            // use next integers to complete the permutations
            solve(n, permu, rs, first + 1);
            // backtrack
            Collections.swap(permu, first, i);
        }
    }
}
