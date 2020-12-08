package easy.leetcode;

public class DefangingAnIPAddress1108 {

}
class DefangingAnIPAddress1108Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}

//Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
//Memory Usage: 37 MB, less than 76.15% of Java online submissions for Defanging an IP Address.

//If not replace, we can run a for loop and append . with [.]


/*
class Solution {
	public String defangIPaddr(String address) {
	    StringBuilder sb = new StringBuilder();
	    if(address.length() == 0 || address == null) return address;
	    for(int i=0; i<address.length(); i++) {
	        if(address.charAt(i) == '.')
	            sb.append("[.]");
	        else
	            sb.append(address.charAt(i));
	    }
	    return sb.toString();
	}
}
*/