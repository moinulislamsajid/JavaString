package JavaString;

public class String1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String Add or Contrinate
		java.lang.String f_Name = "Ayman";
		java.lang.String L_Name = "Sajid";
		
		java.lang.String Full_Name = f_Name + L_Name;
		System.out.println("Full Name : "+Full_Name);
		
		// String Upper Case
		java.lang.String Upper = Full_Name.toUpperCase();
		System.out.println("Upper"+Upper);
		
		java.lang.String Full_name = f_Name.concat(L_Name);
		System.out.print("Full Name : "+Full_name);
		
		
		java.lang.String  Lower = Full_Name.toLowerCase();
		System.out.println("Lower : "+Lower);
		
		
		// String letter staring check
		boolean b = f_Name.startsWith("A");
		System.out.println("If started at B than return true or false : "+b);
		
		// sentence last character check
		boolean last_check = L_Name.endsWith("d");
		System.out.print("return : "+last_check);
		String[] names = {"Ayman","Sajid","Samiur","Skaib"};
		for(String bro : names) {
			System.out.print.("Names are : "+names);
		}
		
	}

}
