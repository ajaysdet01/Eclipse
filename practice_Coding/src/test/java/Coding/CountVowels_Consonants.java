package Coding;

public class CountVowels_Consonants {
	
	public static void main(String[] args) {
		
		String str ="automation testingss";
		int vowel=0,constants=0;
		
		for(char ch:str.toCharArray()) {
			
			if("aeiou".indexOf(ch)!=-1) {
				vowel++;
				System.out.println(ch);
				
			} else if(Character.isLetter(ch)) {
				constants++;
			}
		}
		System.out.println(vowel + " "+ constants);
		}
	}


