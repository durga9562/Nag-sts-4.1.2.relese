package basic;

public class TryCatchEx {

	public static void main(String[] args) {
		try {
			System.out.println("naga");
			int i=2/0;
			try {
				int j=2/0;
				System.out.println("k");
			} catch (Exception f) {
				// TODO Auto-generated catch block
				
				System.out.println("kiran");
			}
			System.out.println("k");
		} catch (Exception e) {
			try {
				int i=2/0;
				System.out.println("k");
			} catch (Exception f) {
				// TODO Auto-generated catch block
				
				System.out.println("mahes");
			}
			finally {
			System.out.println(" try final");	
		}
		}
		finally {
			System.out.println("normal final");
	}
}
}


