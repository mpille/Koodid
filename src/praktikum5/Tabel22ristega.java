package praktikum5;

public class Tabel22ristega {
	public static void main(String[] args) {

		int tabelisuurus = 7;
		int aaris = 9;

		for (int i = 0; i < tabelisuurus; i++) {
			for (int j = 0; j < tabelisuurus; j++) {
				if (i == j || i + j == tabelisuurus - 1) {
					System.out.print("x ");
				} else {
					System.out.print("0 ");
				}

			}
			System.out.println();
		}
	}
}
