package easy.leetcode;

public class CountGoodTriplets1534 {

}


class CountGoodTriplets1534Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
    	if(arr.length==0) return 0;
        
    	int trip = 0, tot = arr.length;
    	for (int i = 0; i < tot - 2; i++)
    		for (int j = i + 1; j < tot - 1; j++)
    			if (Math.abs(arr[i] - arr[j]) <= a)
    				for (int k = j + 1; k < tot; k++)
    					if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[k] - arr[i]) <= c)
    						trip++;
    	return trip;
    }
}


//Runtime: 10 ms, faster than 94.15% of Java online submissions for Count Good Triplets.
//Memory Usage: 36.5 MB, less than 71.07% of Java online submissions for Count Good Triplets.


/* Wrong answer:
 * 
 * public int countGoodTriplets(int[] arr, int a, int b, int c) {
        if(arr.length==0) return 0;
        
        int trip = 0;
        int n = arr.length;
        for(int i =0 ; i<n;i++){
            for(int j=i+1; j<n;j++){
            	if(Math.abs(arr[i]-arr[j]) <a && i!=j){
            		for(int k=j+1; k<n;k++){
                        if(Math.abs(arr[k]-arr[j]) <b  && Math.abs(arr[k]-arr[i]) <c && j!=k && k!=i){
                            trip++;
                        }
                    }
                }
            }
        }
        return trip;
    }
 
public int countGoodTriplets(int[] arr, int a, int b, int c) {
	int count = 0, n = arr.length;
	for (int i = 0; i < n - 2; i++)
		for (int j = i + 1; j < n - 1; j++)
			if (Math.abs(arr[i] - arr[j]) <= a)
				for (int k = j + 1; k < n; k++)
					if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[k] - arr[i]) <= c)
						count++;
	return count;
}


*/