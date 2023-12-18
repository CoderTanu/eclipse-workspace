package question;

public class PassByValueOrReference {
	
	
	int eyes=2;
	
	protected String animal="dog";
	
	
	
	
	

	public static void main(String[] args) {
		
		PassByValueOrReference obj = new PassByValueOrReference();
		obj.eyes=12;
		
		int a=3;
		changeReference(obj);
		System.out.println(obj.eyes);
		
	}
	
//	public static void changePrimitive(int copy) {
//	copy =13;
//	}

	public static void changeReference(PassByValueOrReference copy) {
		copy.eyes=13;
	}
}
