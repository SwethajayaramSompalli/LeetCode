package easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ShuffletheArray1470 {

}


class ShuffletheArray1470Solution {
	 public int[] shuffle(int[] nums, int n) {
	        int[] snum = new int[2*n];
	        if(nums.length==0||nums.length==2) return nums;
	        for(int i =0,j=0; i<2*n;i+=2){
	            snum[i]=nums[j];
	            snum[i+1]=nums[n+j];
	            j++;
	        }
	        return snum;
	}
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Shuffle the Array.
//Memory Usage: 39.6 MB, less than 13.62% of Java online submissions for Shuffle the Array.


/* Two pointer solution 

public int[] shuffle(int[] nums, int n) {

int[] result = new int[nums.length];

int leftPointer = 0;
int rightPointer = n;

int index = 0;

while (rightPointer < nums.length) {

    result[index] = nums[leftPointer];
    result[index + 1] = nums[rightPointer];

    leftPointer++;
    rightPointer++;
    index = index + 2;


}

return result;
}*/