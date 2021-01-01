package easy.leetcode;

public class CountofMatchesinTournament1688 {

}
class CountofMatchesinTournament1688Solution {
    public int numberOfMatches(int t) {
        int m=0;
        while(t>1){
            if (t%2==0){
                m+=t/2;
                t=t/2; 
            }
            else{
                m+=(t-1)/2;
                t=((t-1)/2)+1;
            }
        }
        return m;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Count of Matches in Tournament.
//Memory Usage: 35.9 MB, less than 51.22% of Java online submissions for Count of Matches in Tournament.

/*

return n-1; // even this is working

//recurssion
 * 
 * 
 * 
public int numberOfMatches(int n) {
	if(n==1)
		return 0;
	if(n%2==0)
		return numberOfMatches(n/2) + n/2;
	else
		return numberOfMatches((n-1)/2+1) + (n-1)/2;
}

public int numberOfMatches(int n) {
	if(n<=2)return n-1;
	return n/2 +numberOfMatches((n+1)/2);
}


*/