package easy.leetcode;

public class MinimumTimeVisitingAllPoints1266 {

}

class MinimumTimeVisitingAllPoints1266Solution {
	public int minTimeToVisitAllPoints(int[][] points) {
        int steps=0;
        for(int i =0; i< points.length-1; i++){
            int x = Math.abs(points[i][0]- points[i+1][0]); //find the x axis difference for two points
            int y = Math.abs(points[i][1]- points[i+1][1]); //find the y axis difference for two points
            int d = Math.abs(x-y); //Now find equal no of steps in x and y that we can take diagonally
            int c = Math.abs(Math.max(x,y)-d); //Find the extra steps that need to be taken either vertically or horizontally
            steps+= d+c; // add both common and difference steps.
        }
        return steps;
    }
}


//Runtime: 1 ms, faster than 30.11% of Java online submissions for Minimum Time Visiting All Points.
//Memory Usage: 38.7 MB, less than 42.55% of Java online submissions for Minimum Time Visiting All Points.

