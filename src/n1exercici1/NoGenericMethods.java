package n1exercici1;

public class NoGenericMethods {
	
	private String s1;
	private String s2;
	private String s3;
	
	
	public static void main(String[] args) {
		String s1 = "patates";
		String s2 = "cigrons";
		String s3 = "cogombres";

		NoGenericMethods objecte = new NoGenericMethods(s1, s2, s3);
		NoGenericMethods objecte2 = new NoGenericMethods(s2, s1, s3);
		NoGenericMethods objecte3 = new NoGenericMethods(s2, s3, s1);
		
		System.out.println(objecte);
		System.out.println(objecte2);
		System.out.println(objecte3);
	}
	
	
	public NoGenericMethods(String s1, String s2, String s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	
	
	public String getObjecte1() {
		return s1;
	}
	public String getObjecte2() {
		return s2;
	}
	public String getObjecte3() {
		return s3;
	}
	public void setObjecte1(String s1) {
		this.s1 = s1;
	}
	public void setObjecte2(String s2) {
		this.s2 = s2;
	}
	public void setObjecte3(String s3) {
		this.s3 = s3;
	}


	@Override
	public String toString() {
		return "NoGenericMethods: s1=" + s1 + ", s2=" + s2 + ", s3=" + s3;
	}
	

}
