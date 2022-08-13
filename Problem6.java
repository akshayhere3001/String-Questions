public class Problem6{
  public static void main(String[] args){
  
    
    // Problem - 6 -> Find First Non-Repeated Character in String
		String input = "ASKKJAAJD";
		
		for(int i = 0; i<input.length(); i++) {
			boolean unique = true;
			
			for(int j = 0; j<input.length(); j++) {
				
				if(i != j && input.charAt(i) == input.charAt(j)) {
					unique = false;
					break;
				}
			}
			if(unique) {
				System.out.print(input.charAt(i));
				break;
			}
		}  
    
    
  }
}
