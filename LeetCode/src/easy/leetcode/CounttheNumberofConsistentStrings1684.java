package easy.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CounttheNumberofConsistentStrings1684 {

}

class ConsistentStrings1684Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        if(allowed.length()==0||words.length==0) return 0;
        int count=words.length;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<allowed.length();i++){
            map.put(allowed.charAt(i),i);
        }
        for(String s: words){
            for(int i=0; i<s.length();i++){
                if(map.containsKey(s.charAt(i))==false){
                    count--;
                    i=s.length()+1;
                }
            }
        }
        return count;
    }
}


//Runtime: 9 ms, faster than 50.00% of Java online submissions for Count the Number of Consistent Strings.
//Memory Usage: 39.2 MB, less than 100.00% of Java online submissions for Count the Number of Consistent Strings.


/*set flag:
	
public int countConsistentStrings(String allowed, String[] words) {
    Set<Character> set=new HashSet<>();
    for(char c:allowed.toCharArray()){
        set.add(c);
    }
    
    int count=0;
    for(String s:words){
        boolean flag=true;;
        for(char c:s.toCharArray()){
            if(!set.contains(c)){
                flag=false;
                break;
            }
        }
        if(flag) count++;
    }
    return count;
}

Regex
//The solution yields the same speed and memory results as a nested for loop with less lines

public int countConsistentStrings(String allowed, String[] words) {
    StringBuilder regex = new StringBuilder();
    regex.append("^[");
    regex.append(allowed);
    regex.append("]+$");
    int counter = 0;
    for(int i = 0; i < words.length; i++){
        if(words[i].matches(regex.toString())) counter++;
    }
    return counter;
}


2nd method

public int countConsistentStrings(String allowed, String[] words) {
    int res = 0;
    for (String word : words)
        if (word.matches("[" + allowed + "]*"))
            res += 1;
    return res;
}

*/
