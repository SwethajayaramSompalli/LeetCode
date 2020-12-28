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
