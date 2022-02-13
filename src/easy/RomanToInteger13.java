package easy.leetcode;

public class RomanToInteger13 {

}

class Solution {
    public int romanToInt(String s) {
        int num =0;
        if (s.contains("IV")){
            num=num+4;
            s.replace("IV","");
        }
        if (s.contains("IX")){
            num=num+9;
            s.replace("IX","");
        }
        if (s.contains("XL")){
            num=num+40;
            s.replace("XL","");
        }
        if (s.contains("XC")){
            num=num+90;
            s.replace("XC","");
        }
        if (s.contains("CD")){
            num=num+400;
            s.replace("CD","");
        }
        if (s.contains("CM")){
            num=num+900;
            s.replace("CM","");
        }
        while(s.contains("I")){
            num=num+1;
            s.replace("I","");
        }
        while(s.contains("V")){
            num=num+5;
            s.replace("V","");
        }
        while(s.contains("X")){
            num=num+10;
            s.replace("X","");
        }
        while(s.contains("L")){
            num=num+50;
            s.replace("L","");
        }
        while(s.contains("C")){
            num=num+100;
            s.replace("C","");
        }
        while(s.contains("D")){
            num=num+500;
            s.replace("D","");
        }
        while(s.contains("M")){
            num=num+1000;
            s.replace("M","");
        }
        return num;
    }
}