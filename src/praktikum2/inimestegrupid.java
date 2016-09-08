package praktikum2;

import lib.TextIO;

public class inimestegrupid {
	public static void main(String[] args) {
		System.out.println("Palun sisesta inimeste arv");
		int inimesteArv = TextIO.getInt();
		System.out.println("Palun sisesta inimeste arv ühes grupis");
		int grupiSuurus = TextIO.getInt();
		int korrutis = inimesteArv / grupiSuurus;
		System.out.println("Saab moodustada " + korrutis + " gruppi");
		int jääk = inimesteArv % grupiSuurus;
		System.out.println("Üle jääb " + jääk + " inimest");
	}
}
