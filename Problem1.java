public class Problem1{
  public static void main(String[] args){
    
    
    // Problem - 1 -> Reverse a String
		String greet = "hello";
		char[] chArr = greet.toCharArray();
		
		for(int i = chArr.length - 1; i>=0; i--) {
			System.out.print(chArr[i]);
		}
	  
	  
	// Another Approach
		for(int i = greet.length() - 1; i>=0; i--) {
			System.out.print(greet.charAt(i));
		}
    
    
  }
}
