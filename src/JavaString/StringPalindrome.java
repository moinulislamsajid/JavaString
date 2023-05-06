package JavaString;

public class StringPalindrome {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.lang.String s1 = "Ayman Sajid";
		StringBuffer s2 = new StringBuffer(s1);
		String s21 = s2.reverse().toString();
		if(s1.equals(s21)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome Number");
		}
		
		
		

	}

}
