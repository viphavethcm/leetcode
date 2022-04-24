import java.lang.reflect.Array;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {1};
        String s = "abc";
        String t = "abhgdc";
        int x = 8;
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> rs = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();

        for (int num : nums) {
            permutation.add(num);
        }

        for (int i = 0;i < permutation.size(); i++)
        {
            for (int j = permutation.size() - 1;j > i; j--);
            {

            }
        }
        return rs;
    }

}
