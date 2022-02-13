package easy.leetcode;

public class DertermineCharge {

}
class DertermineChargeSolution{
	private static int solve(int K, int M, String[] steps) {
		
		if(M!=steps.length) return -1;
		for (String s : steps) {
			if(s.charAt(0)=='P') {
 		        s = s.replaceAll("[^\\d]", " "); 
		        // Remove extra spaces from the beginning 
		        // and the ending of the string 
		        s = s.trim(); 
		        // Replace all the consecutive white 
		        // spaces with a single space 
		        s = s.replaceAll(" +", " "); 
				K +=Integer.parseInt(s);
			}
			else
		        s = s.replaceAll("[^\\d]", " "); 
		        s = s.trim(); 
		        s = s.replaceAll(" +", " "); 
				K -=Integer.parseInt(s);
		}
		
		return K;
	}
}