import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * */
public class leetcode1 {
    // leetCode 三数之和
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        if(nums == null) return ans;
        int len = nums.length;
        if(len < 3) return ans;
        // 排序
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            // 如果值大于零，三数之和肯定大于零, 退出循环
            if(nums[i] > 0) break;
            // 去重
            if(i> 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = len-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
                else if(sum < 0) left++;
                else if(sum > 0) right--;
            }
        }
        return ans;
    }


    public static void main(String[] args){
        System.out.println("leetCode");
    }
}