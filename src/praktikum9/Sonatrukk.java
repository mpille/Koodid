package praktikum9;

public class Sonatrukk {

	public static void main(String[] args) {

		System.out.println("Sisestage sõna");
		String s6na = lib.TextIO.getlnString();
		String suuredt2hed = s6na.toUpperCase();
		for (int i = 0; i < suuredt2hed.length(); i++) {
			System.out.print(suuredt2hed.charAt(i));
			if (i < suuredt2hed.length() - 1) {
				System.out.print("-");
			}

		}
	}

}
