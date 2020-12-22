package easy.leetcode;

import java.util.LinkedList;
import java.util.List;

public class CreateTargetArrayintheGivenOrder1389 {

}

class CreateTargetArrayintheGivenOrder1389Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        List<Integer> llist = new LinkedList<>();
        for(int i =0; i<index.length;i++){
            llist.add(index[i],nums[i]);
        }
        int[] retlist = new int[index.length];
        int i=0;
        for(int j: llist){
            retlist[i]=j;
            i++;
        }
        return retlist;
    }
}



//Runtime: 1 ms, faster than 47.26% of Java online submissions for Create Target Array in the Given Order.
//Memory Usage: 37.7 MB, less than 45.87% of Java online submissions for Create Target Array in the Given Order.