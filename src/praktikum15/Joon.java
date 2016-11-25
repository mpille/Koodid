package praktikum15;

public class Joon {

	Punkt algusPunkt, l6ppPunkt;

	public Joon(Punkt p1, Punkt p2) {
		algusPunkt = p1;
		l6ppPunkt = p2;
	}

	@Override
	public String toString() {
		return "Joon (" + algusPunkt + ", " + l6ppPunkt + ")";
	}

	public double pikkus() {
		int a = algusPunkt.x - l6ppPunkt.x;
		int b = algusPunkt.y - l6ppPunkt.y;
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
}