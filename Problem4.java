public class Problem4{
  public static void main(String[] args){
  
    
    // Problem - 4 -> Sort a String
		String greet = "akshay";
		
		int len = greet.length();
		
		char[] chArr  = greet.toCharArray();
		
		for(int i = 0; i<len; i++) {
			for(int j = i + 1; j<len; j++) {
				
				if(chArr[i] > chArr[j]) {
					char temp = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = temp;	
				}
			}
		}
		
		// Printing the String
		for(int i = 0; i<len; i++) {
			System.out.print(chArr[i]);
		}
    
    
  
  }
}
