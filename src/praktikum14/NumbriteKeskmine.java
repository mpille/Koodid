package praktikum14;

import java.util.ArrayList;

public class NumbriteKeskmine {

	public static void main(String[] args) {

		ArrayList<String> failiRead = new ArrayList<String>();
		failiRead = FailiLugeja.loeFail("numbrid.txt");
		ArrayList<Double> numbrid = teeNumbriteks(failiRead);
		System.out.println(numbrid);
		double keskmine = arvutaKeskmine(numbrid);
		System.out.println("nende numbrite keskmine väärtus on: " + keskmine);

	}

	public static ArrayList<Double> teeNumbriteks(ArrayList<String> read) {
		ArrayList<Double> numbrid = new ArrayList<Double>();
		for (String rida : read) {
			try {
				double nr = Double.parseDouble(rida);
				numbrid.add(nr);
			} catch (NumberFormatException e) {
				System.out.println("Ei oksa teha seda numbriks: " + rida);
			}
		}
		return numbrid;
	}

	public static double arvutaKeskmine(ArrayList<Double> arvud) {
		double summa = 0;
		for (Double arv : arvud) {
			summa += arv;
		}
		return summa / arvud.size();
	}

}
