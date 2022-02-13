package easy;

public class ToLowerCase709 {

}

class ToLowerCase709Solution {
	public String toLowerCase(String str) {
        int ascii=0;
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<str.length();i++){  // as I am using charAt functionality, I would need a normal for loop
			ascii = str.charAt(i);  //Just assign the char value to an int and ascii is stored.
            if(65<=ascii && ascii<=90){
                sb.append((char)(ascii+32));  //the difference between an Upper case and a lower case letter is value 32 in ascii, append the same to string builder variable
            }
            else{
                sb.append(str.charAt(i));  //if it is in lower case already, just append the same ascii value
            }
        }
        return sb.toString();  //convert it into string and return it.
    }
}


//Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
//Memory Usage: 36.7 MB, less than 86.38% of Java online submissions for To Lower Case.