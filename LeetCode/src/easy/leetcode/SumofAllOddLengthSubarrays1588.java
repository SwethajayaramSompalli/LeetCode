package easy.leetcode;

public class SumofAllOddLengthSubarrays1588 {

}


class SumofAllOddLengthSubarrays1588Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
       for(int window =1; window<=arr.length; window+=2){
           for(int i=0; i+window <=arr.length; i++){
               for(int j=i; j<i+window; j++){
                   sum += arr[j];
               }
           }
       }
       return sum; 
    }
}


/*


Method 1: T: O(n³) | S: O(1) | Sliding Window (Brute force)
public int sumOddLengthSubarrays3(int[] arr) {
	int total = 0;

	for (int window = 1; window <= arr.length; window += 2)
		for (int i = 0; i + window <= arr.length; i++)
			for (int j = i; j < i + window; j++)
				total += arr[j];
	return total;
}
Method 2: T: O(n²) | S: O(1) | Sliding Window (optimised)
public int sumOddLengthSubarrays(int[] arr) {
	int total = 0;

	for (int windowSize = 1; windowSize <= arr.length; windowSize += 2) {
		// sum up all the elements in the first window, W1
		int windowSum = 0;
		for (int i = 0; i < windowSize; i++)
			windowSum += arr[i];
		total += windowSum;

		// slide W1 one element at a time.
		// remove (subtract) the first element from the W1 and insert (add) the last element of the slided W1 into the previous sum.
		for (int i = 1; i + windowSize <= arr.length; i++) {
			windowSum = windowSum - arr[i - 1] + arr[i + windowSize - 1];
			total += windowSum;
		}
	}
	return total;
}
Method 3: T: O(n) | S: O(1) | Counting element occurence
•	courtesy: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/discuss/980310/Dew-It-or-O(n)-1-pass-or-(Almost)-No-math
•	A brilliant solution-explanation combo, please upvote it.
•	I've slightly refactored the above solution. Please read the original solution to understand better.
•	IMO, this solution is one of those that if you already know it, then you know it, else its not easy to conjure this in a live interview, unless you have acute observation skills. No interviewer should expect this solution. Expectation would be that you come up with Method 1 then optimise it to Method 2.
public int sumOddLengthSubarrays(int[] arr) {

	int n = arr.length, sum = 0;

	int evenStops = (n & 1) == 0 ? n /2 : n/ 2 + 1;
	int evenStarts = 1;

	int oddStarts = 0;
	int oddStops = n / 2;

	for (int i = 0; i < n; ++i) {
		sum += ((oddStops * oddStarts) + (evenStops * evenStarts)) * arr[i];
		if ((i & 1) == 0) {
			oddStarts++;
			evenStops--;
		} else {
			evenStarts++;
			oddStops--;
		}
	}
	return sum;
}



*/