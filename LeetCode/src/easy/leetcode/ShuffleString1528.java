package easy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ShuffleString1528 {

}

class ShuffleString1528Solution {
    public String restoreString(String s, int[] indices) {
     
        Map<Integer,Character> map = new HashMap();
        for (int i=0; i<indices.length;i++){
            map.put(indices[i],s.charAt(i));
        }
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<indices.length;i++){
            sb.append(map.get(i));
        }
            
            
        return sb.toString();
    }
}

//Runtime: 3 ms, faster than 22.29% of Java online submissions for Shuffle String.
//Memory Usage: 39.8 MB, less than 9.56% of Java online submissions for Shuffle String.



/*
class Solution {
	public String restoreString(String s, int[] indices) {
	    char[] result = new char[s.length()];
	    for(int i = 0 ; i < indices.length ; i++){
	        result[indices[i]] = s.charAt(i);
	    }
	    return new String(result);
	}
}
*/