package easy.leetcode;

public class PalindromeNumber9 {

}


class SolutionPalindromeNumber9 {
    public boolean isPalindrome(int x) {
        
        if(x<0) {return false;}
        int temp, y=0,x1=x;
        while(x!=0){
            temp = x%10;
            if (y > Integer.MAX_VALUE/10 || (y == Integer.MAX_VALUE / 10 && temp > 7)) 
            {return false;}
            y=y*10+temp;
            x/=10;
        }
        return x1==y;
    }
}

//12/07/2020 10:39	Accepted	10 ms	41.1 MB	java - when checked x<0 at the first
//12/07/2020 10:38	Accepted	14 ms	41.1 MB	java