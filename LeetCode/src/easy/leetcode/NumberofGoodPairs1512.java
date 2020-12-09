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


//Using an array to count the occurences
/*
class Solution {
	public int numIdenticalPairs(int[] nums) {
	    int[]  op = new int[101];
	    int c=0;
	    for(int i:nums) {
	        c+=op[i]++;
	    }
	    return c;
	}
}*/


//Using Hashmap to cound occurances 
/*
class Solution {
	public int numIdenticalPairs(int[] nums) {
	    //we need nested loop to compare OR
	    //use dictionary to store unique values then see if they come up again, increment, add to final count
	    
	    HashMap<Integer, Integer> numSet = new HashMap();
	    int count = 0;
	    for(int i = 0; i < nums.length; i++){
	        if(!numSet.containsKey(nums[i])) numSet.put(nums[i], 1); //marks each unique value
	        else if(numSet.containsKey(nums[i])){
	            count += numSet.get(nums[i]); //adds amount of each value
	            numSet.put(nums[i], numSet.get(nums[i]) + 1);
	        }
	    }
	    return count;
	}
}*/