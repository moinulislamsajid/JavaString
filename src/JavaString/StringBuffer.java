package JavaString;

public class StringBuffer {

	public StringBuffer(java.lang.String string) {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String Buffer 
		StringBuffer hey = new StringBuffer("Ayman sajid");
		System.out.println(hey);
		
		hey.append(" Faridpur");
		hey.append(233);
		System.out.println(hey);
		
		// delete element
		hey.delete(0, 5);
		System.out.pirntln(hey);
		
		// fixed length element print
		hey.setLength(10);
		System.out.printkn(hey);
		
		
		

	}

}
