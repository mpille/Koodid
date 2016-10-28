package praktikum11;

public class astendajarekursiivsus {

	public static void main(String[] args) {
		System.out.println(astenda(2, 4));
		System.out.println(astenda(3, 4));
	}

	private static int astenda(int a, int b) {
		if (b <= 1) {
			return a;
		}
		return a * astenda(a, b - 1);

		// int tulemus = a;
		// for (int i = 0; i < b - 1; i++) {
		// tulemus = tulemus * a;
		// }
		// return tulemus;
	}
}