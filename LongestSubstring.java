import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
    String str = "abcdabcaba";
    String longest = "";

    for(int i=0;i<str.length();i++){
        String temp ="";

        for(int j=i;j<str.length();j++){
            char ch = str.charAt(j);

            if(temp.indexOf(ch) != -1){
                break;
            }
            temp = temp+ch;
            if(temp.length()>longest.length()){
                longest = temp;
            }
        }
    }
    System.out.println("the longest word is "+longest);
    System.out.println("the length is "+longest.length());
}
}
