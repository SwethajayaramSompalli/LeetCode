package easy;

public class ReverseInteger7 {

	public static void main(String[] args) {
		
		int x = 2147483647;
		
		

	}

}


// I tried but got error

/*
class Solution {
    public int reverse(int x) throws Exception {
        int reverse = 0, temp =0;
        try{
            while(x!=0){
            temp = x%10;
            reverse = reverse*10+temp;
                //Line 7: error: unreported exception Exception; must be caught or declared to be thrown [in __Driver__.java]
                // int ret = new Solution().reverse(param_1);
                            
            x=x/10;
            }
            return reverse;
        }
        catch(Exception e){
            System.out.println("Overflow: 0");
            return 0;
        }
        
        
    }
}*/


//Solution

class SolutionReverseInteger7 {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

//Solution 2   strings

/*String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
try {
    return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
} catch (NumberFormatException e) {
    return 0;
}*/