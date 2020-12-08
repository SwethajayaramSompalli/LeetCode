package easy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class JewelsandStones771 {

}

//Hash Map

class JewelsandStones771Solution {
	public int numJewelsInStones(String J, String S) {
        if(J==null ||S==null) return 0;
        int sum =0;
         //1 loop-s and 1 hashmap-j
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<J.length();i++){
            map.put(J.charAt(i),i);
        }
        for (int i =0; i<S.length();i++){
            if(map.get(S.charAt(i))!=null) sum++;
            
        }  
        return sum;
	}
}

//Runtime: 1 ms, faster than 69.90% of Java online submissions for Jewels and Stones.
//Memory Usage: 37.8 MB, less than 16.15% of Java online submissions for Jewels and Stones.


//HashSet
/*
class Solution {
    public int numJewelsInStones(String J, String S) {
        if(J==null ||S==null) return 0;
        int sum =0;
         //1 loop-s and 1 hashmap-j
        Set<Character> set = new HashSet<>();
        for(int i=0; i<J.length();i++){
            set.add(J.charAt(i));
        }
        for (int i =0; i<S.length();i++){
            if(set.contains(S.charAt(i))==true) sum++;
        }  
        return sum;
    }
}

Runtime: 1 ms, faster than 69.90% of Java online submissions for Jewels and Stones.
Memory Usage: 37.8 MB, less than 16.15% of Java online submissions for Jewels and Stones.
*/


/* Streams:
 * 
 * public int numJewelsInStones(String J, String S) {
        int identify[] = new int[128];
        J.chars().forEach(c -> identify[c] = 1);
        return (int)S.chars().filter(c -> identify[c] == 1).count();
    }
    
    */
 

