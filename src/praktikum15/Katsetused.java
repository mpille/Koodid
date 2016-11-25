package praktikum15;

public class Katsetused {

	public static void main(String[] args) {

		Punkt p1 = new Punkt(1, 4);
		System.out.println(p1);
		Punkt p2 = new Punkt(3, 7);
		System.out.println(p2);

		Joon j = new Joon(p1, p2);
		System.out.println(j);
		System.out.println("Joone pikkus on: " + j.pikkus());

		Ring r = new Ring(p1, 10);
		System.out.println(r);
		//System.out.println("Pindala: " + r.pindala());
		//System.out.println("Ymbermoot: " + r.ymbermoot());
		
		Silinder s = new Silinder(r, 20.0);

	}
}
