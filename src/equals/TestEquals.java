package equals;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville v1 = new Ville("Paris",3000000);
		Ville v2 = new Ville("Lyon",1000000);
		Ville v3 = new Ville("Lyon",1000000);
		
		System.out.println(v1.equals(v3));
		System.out.println(v2.equals(v3));
		
		System.out.println(v1 == v3);
		System.out.println(v2 == v3);

	}

}
