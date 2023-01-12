import java.util.Arrays;

/**
 * Given a non-empty array of integers nums,
 * every element appears twice except for one.
 * Find that single one.
 */

public class Problem_136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }
}
