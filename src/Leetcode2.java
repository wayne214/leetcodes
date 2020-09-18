import java.util.*;

/**
 * 两数之和
 * */
public class Leetcode2 {
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
        Leetcode2 leetcode2 = new Leetcode2();
        int[] arr = {1,2,3,4};
        int[] ints = leetcode2.twoSum(arr, 6);
        System.out.println(ints.length);
    }
}