package aniket;

public class CountStringValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aniketAniket165";
		  int lowerCaseCount = 0;
	        int upperCaseCount = 0;
	        int digitCount = 0;
	        int specialSymbolCount = 0;
	        int spaceCount = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	          
	            if (Character.isLowerCase(ch)) {
	                lowerCaseCount++;
	            }
	            
	            else if (Character.isUpperCase(ch)) {
	                upperCaseCount++;
	            }
	           
	            else if (Character.isDigit(ch)) {
	                digitCount++;
	            }
	           
	            else if (Character.isWhitespace(ch)) {
	                spaceCount++;
	            }
	          
	            else {
	                specialSymbolCount++;
	            }
	        }
	        System.out.println("Lowercase letters: " + lowerCaseCount);
	        System.out.println("Uppercase letters: " + upperCaseCount);
	        System.out.println("Digits: " + digitCount);
	        System.out.println("Special symbols: " + specialSymbolCount);
	        System.out.println("Spaces: " + spaceCount);

	}

}
