package easy;

public class NumberofStepstoReduceaNumbertoZero1342 {

}


class NumberofStepstoReduceaNumbertoZero1342Solution {
    public int numberOfSteps (int num) {
        if (num<1) return 0;
        int steps = 0;
        while(num>1){
            if(num%2==0){
                steps++;
                num=num/2;
            }else{
                steps+=2;
                num=num/2;
            }
            //Withour if else
            //num = num%2==0?num/2:num-1;
            //steps++;
            
        }
        return (steps+1);
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Number of Steps to Reduce a Number to Zero.
//Memory Usage: 35.7 MB, less than 74.56% of Java online submissions for Number of Steps to Reduce a Number to Zero.

/*Recursive approach 1 :

public int numberOfSteps (int num) {
        return numberOfSteps(num,0);
    }
    
private int numberOfSteps (int num , int count){
        if(num==0)return count;
	    return num%2==0?numberOfSteps(num/2,++count):numberOfSteps(num-1,++count);
    }
Recursive approach 2 :

public int numberOfSteps (int num) {
      if(num==0)return 0;
	  return 1 + numberOfSteps(num%2==0?num/2:num-1);
    }
    
Bit Manipulation:

class Solution {
    public int numberOfSteps (int num) {
        int one = 0, zero = 0;
        for(int i = 0; i < 32; i++) {
            if((num & (1 << i)) > 0) {
                one ++;
                zero = Math.max(zero, i);
            }
        }
        return one + zero;
    }
}
    
*/