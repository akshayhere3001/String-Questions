public class Problem5{
  public static void main(String[] args){
    
    
    // Problem - 5 -> Replace Character with its occurence
		
		String greet = "hello";
		char charToBeReplace = 'l';
		// Expected Output = he120
		
		// check if the given character is present in the String or not
		
		if(greet.indexOf(charToBeReplace) == -1) {
			System.out.print("Given Character is not present in the String");
			System.exit(0);
		}
		
		// else Replace the char to the accurance in String
		
		// 1st Conver it to Array
		
		char arr[] = greet.toCharArray();
		int count = 1;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == charToBeReplace) {
				arr[i] = String.valueOf(count).charAt(0);
				count++;
			}
		}
 		
		System.out.print(Arrays.toString(arr));
    
    
  }
}
