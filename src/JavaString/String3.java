package JavaString;

public class String3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sentence replace 
		java.lang.String Our_country = "This is my country";
		System.out.println("now Printing : "+Our_country);
		
		java.lang.String replce_character = Our_country.replace('o','j');
		System.out.println("Afater Replace : "+replce_character);
		
		// Division sentence for split
		
		java.lang.String[] s3 = Our_country.split(" "); // space deaci tai spece thaka division hoba
		for(java.lang.String x : s3) {
			System.out.println(x);
		}
		

	}

}
