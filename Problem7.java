public class Problem7{
  public static void main(String[] args){
    
    
    // Problem - 7 -> Java Program to Reverse Each Word in String
		String input = "hello world";
		
		String[] words = input.split(" ");
		String output = "";
		
		for(String word : words) {
			String reversedWord = "";
		for(int i = word.length() - 1; i>=0; i--) {
			reversedWord = reversedWord + word.charAt(i);
			}
		
			output = output + reversedWord + " ";
		}
		
		System.out.print(output);

    
    
  }
}
