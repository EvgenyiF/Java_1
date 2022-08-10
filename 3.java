import java.util.List;
import java.util.ArrayList;
class Solution {
    
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(s);
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        s = s.trim();
        s= s.replaceAll("[\\s]{2,}", " ");
        List<String> parts = new ArrayList<String>();
        int a=0;
        for (int i = -1; (i = s.indexOf(" ", i+1)) != -1; ) {
            // System.out.println(i);
            
            parts.add(s.substring(a, i));
            a=i+1;
        }
        parts.add(s.substring(a, s.length()));
        System.out.println(parts);
        String[] strArray = parts.toArray(new String[0]);

        for (int i=0; i<strArray.length/2;i++){
            String temp = strArray[i];
            strArray[i] = strArray[strArray.length-1-i];
            strArray[strArray.length-1-i] = temp;
            
        }
        
        s = String.join(" ", strArray);
           
        return s;
    }
    
}