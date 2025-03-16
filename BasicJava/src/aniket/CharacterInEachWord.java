package aniket;

public class CharacterInEachWord {
    public static void main(String[] args) {
       
        String str = "Hello world this is Java";

      
        int wordLength = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

           
            if (ch != ' ') {
                if (inWord==false) {
                   
                    if (wordLength > 0) {
                       
                        System.out.println("Word length: " + wordLength);
                    }
                    wordLength = 1;
                    inWord = true;
                } else {
                    wordLength++;
                }
            } else {
                
                if (inWord==true) {
                    System.out.println("Word length: " + wordLength);
                    wordLength = 0;  // Reset for the next word
                    inWord = false;
                }
            }
        }

       
        if (inWord) {
            System.out.println("Word length: " + wordLength);
        }
    }
}
