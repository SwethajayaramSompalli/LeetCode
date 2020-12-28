package easy.leetcode;

public class MaximumNestingDepthoftheParentheses1614 {

}

class Solution {
    public int maxDepth(String s) {
        //String s1 = s.replaceall(^[a-zA-Z\+\-\*\\]$);
        int cD=0, mD=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('){
                cD++;
                mD=Math.max(cD,mD);
            }
            else if(s.charAt(i)==')'){
                cD--;
            }
        }
        return mD; 
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Nesting Depth of the Parentheses.
//Memory Usage: 37.3 MB, less than 37.10% of Java online submissions for Maximum Nesting Depth of the Parentheses.