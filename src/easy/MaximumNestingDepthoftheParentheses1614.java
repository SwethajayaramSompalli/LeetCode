package easy;

public class MaximumNestingDepthoftheParentheses1614 {

}

class MaximumNestingDepthoftheParenthesesSolution {
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


//Stack
/*

public int maxDepth(String s) {
	Stack<String> h = new Stack<>();
	int maxNumParentheses = 0;
	for (char i : s.toCharArray()){
		if (i == '('){
			h.push("(");
			maxNumParentheses = Math.max(maxNumParentheses, h.size());
		}
		else if (i == ')'){
			h.pop();
		}
	}
	return maxNumParentheses;
}


Faster than 100.00%, Less memory than 93.76% -- O(n)

class Solution {
	public int maxDepth(String s) {
	    int max = 0;
	    int current = 0;
	    for(int i=0; i<s.length(); i++){
	        if(s.charAt(i) == '(')
	            current++;
	        if(current >= max)		
	            max = current;		//assigns only when it goes through the if condition
	        if(s.charAt(i) == ')')
	            current--;
	    }
	    return max;
	}
}

*/