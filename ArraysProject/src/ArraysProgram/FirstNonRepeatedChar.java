package ArraysProgram;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		String str = "Ammveerasbrabskhakhzan Zan";
		char[] ch = str.toLowerCase().toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (str.indexOf(ch[i]) == str.lastIndexOf(ch[i])) {
				System.out.println(ch[i]);
				break;
			}
		}

	}
}
