import java.util.*;

/**
 * 两数之和
 * */
public class leetcode2 {
    // leetCode 两数之和
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complete = target - nums[i];
            if(map.containsKey(complete)){
                return new int[]{map.get(complete),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }


    public static void main(String[] args){
        System.out.println("leetCode");
    }
}