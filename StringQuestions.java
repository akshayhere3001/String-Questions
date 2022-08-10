public class StringQuestions{
	public static void main(String[] args) {
		
		// Problem - 1 -> Write a java Program to convert a String in Lower case
		String name = "Ryan ReyNOLDs";
		name = name.toLowerCase();
		System.out.println(name);
		
		// Problem - 2 -> Replace Spaces with UnderScore
		String text = "Replaced Spaces with UnderScore";
		text = text.replace(" ", "_");
		System.out.println(text);
		
		// Problem - 3 -> Write a java program to detect double and triple spaces in String
		String my_string = "This  String contains double and triple   spaces";
		
		System.out.println(my_string.indexOf("  "));
		System.out.println(my_string.indexOf("   "));
		
		// Problem - 4 -> Write a letter using Escape Sequence Character
		String letter2 = "Dear Sir, \nI Agreed with your Decision.\nThanks!";
		System.out.print(letter2);
    
    
	}
}
