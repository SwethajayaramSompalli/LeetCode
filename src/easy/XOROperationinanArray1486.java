package easy.leetcode;

public class XOROperationinanArray1486 {

}

class XOROperationinanArray1486Solution {
    public int xorOperation(int n, int start) {
        int nums[] = new int[n];
        int bit=0;
        for(int i=0; i<n;i++){
            nums[i]=start + 2*i;
        }
        for(int i=0; i<n;i++){
            bit = nums[i]^bit;
        }
        return bit;
    }
}


//Runtime: 0 ms, faster than 100.00% of Java online submissions for XOR Operation in an Array.
//Memory Usage: 35.9 MB, less than 27.67% of Java online submissions for XOR Operation in an Array.

/*
 * class Solution {
    public int xorOperation(int n, int start) {
        int nums[] = new int[n];
        int bit=0;
        for(int i=0; i<n;i++){
            nums[i]=start + 2*i;
            bit = nums[i]^bit;
        }
        return bit;
    }
}

Runtime: 0 ms, faster than 100.00% of Java online submissions for XOR Operation in an Array.
Memory Usage: 35.3 MB, less than 97.78% of Java online submissions for XOR Operation in an Array.


No need of nums

class Solution {
    public int xorOperation(int n, int start) {
        int bit=0;
        for(int i=0; i<n;i++){
            bit^=start + 2*i;
        }
        return bit;
    }
}


 */
