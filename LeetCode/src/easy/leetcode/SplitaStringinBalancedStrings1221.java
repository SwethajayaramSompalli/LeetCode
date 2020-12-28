package easy.leetcode;

public class SplitaStringinBalancedStrings1221 {

}


class SplitaStringinBalancedStrings1221Solution {
    public int balancedStringSplit(String s) {
        int p =0, c=0;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='R') p++;
            else p--;
            if (p==0) c++;
        }
        return c;
    }
}


//Runtime: 0 ms, faster than 100.00% of Java online submissions for Split a String in Balanced Strings.
//Memory Usage: 36.9 MB, less than 59.64% of Java online submissions for Split a String in Balanced Strings.

/*

ternary operator

public int balancedStringSplit(String s) {
	int count = 0, balanced = 0;
	for (int i = 0; i < s.length(); i++) {
		count += (s.charAt(i) == 'L') ? 1 : -1;
		if (count == 0)
			balanced++;
	}
	return balanced;
}
*/