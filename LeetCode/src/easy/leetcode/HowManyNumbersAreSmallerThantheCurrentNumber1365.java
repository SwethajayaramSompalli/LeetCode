package easy.leetcode;

public class HowManyNumbersAreSmallerThantheCurrentNumber1365 {

	
}



class 1365Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] smallnums = new int[nums.length];
        
        for(int i=0;i< nums.length;i++){
            int count =0;
            for(int j:nums){
                if (nums[i]>j) count++;
            }
            smallnums[i]=count;
        }   
        return smallnums;
    }
}





//Runtime: 12 ms, faster than 46.37% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.
//Memory Usage: 39.6 MB, less than 12.68% of Java online submissions for How Many Numbers Are Smaller Than the Current Number.