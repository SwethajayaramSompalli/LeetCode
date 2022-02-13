package easy;

public class RunningSumOf1dArray1480 {

}
class RunningSumOf1dArray1480Solution {
    public int[] runningSum(int[] nums) {
        for(int i =1; i<nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
//Memory Usage: 40 MB, less than 5.52% of Java online submissions for Running Sum of 1d Array.