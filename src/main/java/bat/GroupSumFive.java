package bat;

/**
 * @author alexandrubostan
 * @since 25.07.2015
 */
public class GroupSumFive {
    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }

        if (nums[start] % 5 == 0) {
            if (start + 1 < nums.length && nums[start + 1] == 1)
                return (groupSum5(start + 1, nums, target - nums[start]));
        }
       // if (groupSum5(start + 1, nums, target)) return true;
        //if (groupSum5(start + 1, nums, target - nums[start])) return true;
        return false;
    }

    public static void main(String[] args) {
        GroupSumFive g = new GroupSumFive();
        System.out.println(g.groupSum5(0, new int[]{2, 5, 10, 4}, 12));
    }

}
