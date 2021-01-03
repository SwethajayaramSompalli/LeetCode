package easy.leetcode;

public class FindNumberswithEvenNumberofDigits1295 {

}


class EvenNumberofDigits1295Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        for(int i: nums){
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            int length = sb.length();
            if (length%2==0)
                count++;
        }
        return count;
    }
}

//Runtime: 2 ms, faster than 15.55% of Java online submissions for Find Numbers with Even Number of Digits.
//Memory Usage: 38.3 MB, less than 93.11% of Java online submissions for Find Numbers with Even Number of Digits.

//I have converted the integer into a string builder variable to find the length of it. Then check for modulus 2 to find if the length is even.

//If you do the same in strings but not with string builder, time complexity will be less where as space complexity is high. String buffer/ string builders are slow.
/*

Using logerthemic

public int findNumbers(int[] nums) {
	int count = 0;
	for (int num : nums) {
		int numOfDigits = (int) Math.floor(Math.log10(num)) + 1;
		if ((numOfDigits & 1) == 0)
			count++;
	}
	return count;
}



faster than 94.22


class Solution {
    public boolean test(int n){
        if(n==0){
            return true;
        }
        return false==test(n/10);
    }
    public int findNumbers(int[] nums) {
        int sum = 0;
        for(int i: nums){
            if(test(i)){
                sum++;
            }
        }
        return sum;
    }
}

*/