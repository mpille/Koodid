package praktikum2;

import lib.TextIO;

public class nimelugeja {
	public static void main(String[] args) {
		System.out.println("Mis on teie nimi?");
		String nimi = TextIO.getlnString();
		int nimePikkus = nimi.length();
		System.out.println("Teie nimes on "+nimePikkus+" tähte.");
	}
}
