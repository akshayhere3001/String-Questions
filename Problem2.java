public class Problem2{
  public static void main(String[] args){
  
    		
		// Problem - 2 -> Remove Special character from a String
		String greet = "$#$@#A#$ks@#ha#y";
		
		greet = greet.replaceAll("[^a-zA-Z0-9]", "");
		System.out.print(greet);
    
    
    
  }
}
