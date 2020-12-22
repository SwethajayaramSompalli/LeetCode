package easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedList1313 {


}
/*
class DecompressRunLengthEncodedList1313Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length;i++){
            for(int j=0; j<nums[i];j++){
            	list.add(nums[i+1]);
            }
            i++;
        }
        int[] retList = new int[list.size()];
        int k=0;
        for(int i : list) {
        	retList[k]=i;
        	k++;
        }
        return retList;
    }
}
*/

//Runtime: 3 ms, faster than 48.83% of Java online submissions for Decompress Run-Length Encoded List.
//Memory Usage: 39.4 MB, less than 92.05% of Java online submissions for Decompress Run-Length Encoded List.


//Will find the size  first to save space/ememory of list

class DecompressRunLengthEncodedList1313Solution {
    public int[] decompressRLElist(int[] nums) {
        int maxSize =0;
        for(int i =0; i<nums.length;i+=2) {
        	maxSize+=nums[i];
        }
        int[] retlist = new int[maxSize];
        int j=0;
        for(int i =0; i<nums.length;i+=2){
            for(int k=0; k<nums[i];k++){
            	retlist[j]=nums[i+1];
            	j++;
            }
        }
        return retlist;       
    }
}


//Runtime: 1 ms, faster than 91.02% of Java online submissions for Decompress Run-Length Encoded List.
//Memory Usage: 39.6 MB, less than 57.48% of Java online submissions for Decompress Run-Length Encoded List.
