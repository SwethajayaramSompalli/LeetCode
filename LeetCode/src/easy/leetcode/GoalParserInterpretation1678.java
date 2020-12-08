package easy.leetcode;

public class GoalParserInterpretation1678 {

}

class GoalParserInterpretation1678Solution {
    public String interpret(String command) {
        StringBuffer s = new StringBuffer("");
        for(int i =0; i<command.length();i++ ){
            if(command.charAt(i)=='G'){
                s.append('G');
            }
            else if (command.charAt(i+1)==')'){
                s.append("o");
                i++;
            }
            else if(command.charAt(i+1)=='a'){
                s.append("al");
                i+=3;
            }
        }
        return s.toString();
    }
}


//Runtime: 1 ms, faster than 68.97% of Java online submissions for Goal Parser Interpretation.
//Memory Usage: 38.7 MB, less than 56.93% of Java online submissions for Goal Parser Interpretation.


//We can use Regex or Replace all method.

//s = command.replace("(al)", "al").replace("()", "o");

//return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");