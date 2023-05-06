package JavaString;

public class String2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.lang.String country = "    Bangladesh is my country    ";
		System.out.println(country);
		
		// space cancel
		
		java.lang.String space = country.trim();
		System.out.println(space);
		// at index element
		char ch = country.charAt(0);
		System.out.println("Values : "+ch);
		
		// character ASCII code
		
		int ascii = country.codePointAt(0);
		System.out.println("Values : "+ascii);
		
		// character index number 
		
		int index = country.indexOf('g');
		System.out.println("Index Number : "+index);
		
		// last any character
		
		index = country.lastIndexOf('o');
		System.out.println("Last position of n = "+index);
		


		
		
	}

}
