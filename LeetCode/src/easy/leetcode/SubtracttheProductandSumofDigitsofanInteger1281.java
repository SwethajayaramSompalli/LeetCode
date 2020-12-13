package easy.leetcode;

public class SubtracttheProductandSumofDigitsofanInteger1281 {
	
	class SubtracttheProductandSum1281Solution {
	    public int subtractProductAndSum(int n) {
	        if(n<9) return 0;
	        int s=0, p=1,t;
	        while(n>=1){
	            t=n%10;
	            s+=t;
	            p*=t;
	            n/=10;
	        }
	        return p-s;
	    }
	}

}


//Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
//Memory Usage: 36 MB, less than 27.79% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.