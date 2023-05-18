package ArraysProgram;

public class NonReaptedCharactersInString {
	public static void main(String[] args) {
		String str="AmeerBasha";
		char[] ch = str.toLowerCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '^';

				}
			}
			if (count == 0 && ch[i] != '^') {
				System.out.println(ch[i]);
				break;
				
			}
		}
	}

}
