package easy.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies1431 {

}

class KidsWiththeGreatestNumberofCandies1431Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int high = 0;
        for(int i: candies){
            if(i>high){
                high=i;
            }
        }
        
        List<Boolean> sol = new ArrayList<>();
        for (int i : candies){
            if(i+extraCandies>=high){
                sol.add(true);
            }
            else sol.add(false);
            //Instead of if else, we can also write the condition in add
            //sol.add(i + extraCandies >= high);
        }
        return sol;
    }
}



//Runtime: 0 ms, faster than 100.00% of Java online submissions for Kids With the Greatest Number of Candies.
//Memory Usage: 39.1 MB, less than 55.41% of Java online submissions for Kids With the Greatest Number of Candies.



/*Streams:
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	int max = Arrays.stream(candies)
					.max()
					.getAsInt();
	return Arrays.stream(candies)
				 .mapToObj(candy -> candy + extraCandies >= max)
				 .collect(Collectors.toList());
}*/