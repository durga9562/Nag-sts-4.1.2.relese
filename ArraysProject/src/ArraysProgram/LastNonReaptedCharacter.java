package ArraysProgram;

public class LastNonReaptedCharacter {
	public static void main(String[] args) {
		String str = "AmeerBasha";
		char[] ch = str.toCharArray();

		for (int i = ch.length-1; i >= 0; i--) {

			if (str.indexOf(ch[i]) == str.lastIndexOf(ch[i])) {
				System.out.println(ch[i]);
				break;
			}

		}

	}

}
