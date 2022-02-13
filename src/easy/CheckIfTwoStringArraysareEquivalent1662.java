package easy;

public class CheckIfTwoStringArraysareEquivalent1662 {

}

class CheckIfTwoStringArraysareEquivalent1662Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1 = new StringBuilder();
        for (String s: word1){
            s1.append(s);
        }
        StringBuilder s2 = new StringBuilder();
        for (String s: word1){
            s2.append(s);
            
        }
        return s1.compareTo(s2)==0;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Check If Two String Arrays are Equivalent.
//Memory Usage: 37.1 MB, less than 67.68% of Java online submissions for Check If Two String Arrays are Equivalent.

//one line

//return String.join("", word1).equals(String.join("", word2));