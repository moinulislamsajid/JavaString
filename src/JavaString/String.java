package JavaString;

public class String {

	
		public String(java.lang.String string) {
		// TODO Auto-generated constructor stub
	}

		// TODO Auto-generated constructor stub
	

	@SuppressWarnings("unused")
	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		// String
		// String Class
		
		// declaring String
		
		java.lang.String name = "Ayman Sajid";
		
		// create String with objects
		Object hey = new String("Ayman Sajid");
		
		System.out.println("First Name : "+name);
		System.out.println(hey);
		
		// Character of array
		char[] s3 = {'s','a','j','i','d'};
		System.out.println(s3);
		int len = name.length();
		System.out.println("Length of first name : "+len);
		
		// digit equal
		if(name.equals(hey)) {
			System.out.println("Equals");
		}else {
			System.out.println("They are Not Equal");
		}
		
		// when upper case and lower case are ignore than use 
		if(name.equals(hey)) {
			System.out.println("Equals");
		}else {
			System.out.println("They are Not Equal");
		}
		// element contain or not
		
		boolean result = name.contains("Ayman Sajid");
		System.out.println("Now Return : "+result);
		
		// is empty
		boolean is_free = name.isEmpty();
		System.out.println("Than return value : "+is_free);


	}

}
