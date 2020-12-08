package easy.leetcode;

public class NumberofGoodPairs1512 {

}


class NumberofGoodPairs1512Solution {
    public int numIdenticalPairs(int[] nums) {
        //can do by two for loops
        if(nums.length<2) return 0;
        int gpair=0;
        for(int i =0; i<nums.length; i++){
            for(int j =i+1; j<nums.length; j++){
                if(nums[i]==nums[j]) gpair++;
            }
        }
        return gpair;
    }
}

//Runtime: 1 ms, faster than 61.13% of Java online submissions for Number of Good Pairs.
//Memory Usage: 36.7 MB, less than 17.68% of Java online submissions for Number of Good Pairs.

