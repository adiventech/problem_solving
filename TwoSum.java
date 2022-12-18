// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
// You can return the answer in any order.
//
// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
import java.util.HashMap;
import java.util.Map;

class TwoSum{
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
    int diff;
    for(int i=0; i<nums.length; i++)
    {
      diff = target - nums[i];
      if (hashMap.containsKey(diff)){
        return new int[] {hashMap.get(diff),i};
      }
      else
      {
        hashMap.put(nums[i],i);
      }
    }
    return new int[] {};
  }
}
