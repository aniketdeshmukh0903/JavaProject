package basicb;

public class StringOne {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String s = "aaabbabc";
        int[] al = new int[256]; 
        
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            al[ch]++;
        }
        
       
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (al[ch] == 1) {
                System.out.println(ch);
                
            }
        }
    }
}
