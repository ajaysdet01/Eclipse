package Coding;

public class reverstring_2 {
	
	public static void main(String[] args) {
		
		String rev = "asus laptops..";
		String rev2 = "";
				
		for(int i=rev.length()-1;i>=0;i--) {
			
			rev2 =rev2+rev.charAt(i);
		}
			System.out.println(rev2);
		}
		
		


}
