package easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class RichestCustomerWelth1672 {

}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Richest Customer Wealth.
//Memory Usage: 38.7 MB, less than 50.24% of Java online submissions for Richest Customer Wealth.



class Solution {
    public int maximumWealth(int[][] accounts) {
        List<Integer> sum = new ArrayList<>();
        int temp =0;
        for(int[] i : accounts){
            for(int j : i){
                temp = temp+ j;
            }
            sum.add(temp);
            temp = 0;
        }
        
        for(int i : sum){
            if(i > temp){
                temp = i;
            }
        }
        return temp;
        
    }
}