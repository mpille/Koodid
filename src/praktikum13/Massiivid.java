package praktikum13;

public class Massiivid {

	public static void main(String[] args) {

		int[] arvud = { 3, 5, 7, 1, -4, 9 };
		int[][] neo = {
				{1, 1, 1, 1, 1},
				{2, 3, 4, 5, 6},
				{3, 4, 5, 6, 7},
				{4, 5, 6, 7, 8},
				{5, 6, 7, 8, 9},
		};

		//tryki(arvud);
		//tryki(ridadeSummad(neo));
		System.out.println(korvalDiagonaaliSumma(neo));
		
	}

	/*
	 * Kirjutada meetod, mis trükib ekraanile ühel real parameetrina etteantud
	 * ühemõõtmelise täisarvumassiivi elemendid
	 */
	public static void tryki(int[] massiiv) {
		for (int arv : massiiv) {
			System.out.print(arv + " ");
		}
		System.out.println();
	}

	/*
	 * Kirjutada meetod, mis trükib ekraanile parameetrina etteantud
	 * kahemõõtmelise massiivi (maatriksi)
	 * 
	 * Kasuta maatriksi rea trükkimiseks kindlasti eelnevalt kirjutatud meetodit!
	 */
	public static void tryki(int[][] maatriks) {
		for (int[] rida : maatriks) {
			tryki(rida);
		}
	}

	/*
	 * Arvutada maatriksi iga rea elementide summa
	 */
	public static int[] ridadeSummad(int[][] maatriks) {
		int[] summad = new int[maatriks.length];
		for (int i = 0; i < summad.length; i++) {
			summad[i] = reaSumma(maatriks[i]);
		}
		return summad;
	}

	public static int reaSumma(int[] massiiv) {
		int summa = 0;
		for (int arv : massiiv) {
			summa += arv;
		}
		return summa;
	}
	
	/*
	 * Arvutada kõrvaldiagonaali elementide summa (kõrvaldiagonaal on see, mis
	 * jookseb ülevalt paremast nurgast alla vasakusse nurka).
	 */
	public static int korvalDiagonaaliSumma(int[][] maatriks) {
		int summa = 0;
		for (int i = 0; i < maatriks.length; i++) {
			for (int j = 0; j < maatriks[i].length; j++) {
				if (i + j == maatriks.length - 1) {
					summa += maatriks[i][j];

				}
			}
		}
		return summa;
	}
}
