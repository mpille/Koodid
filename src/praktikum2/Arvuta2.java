package praktikum2;

import lib.TextIO;

public class Arvuta2 {
	public static void main(String[] args) {
		int arv1;
		int arv2;
		int korrutis;
		int textio = 4;
		System.out.println("Palun sisesta kaks arvu");
		arv1 = TextIO.getInt();
		System.out.println("x");
		arv2 = TextIO.getInt();
		korrutis = arv1 * arv2;
		System.out.println("="+korrutis);
	}
}
