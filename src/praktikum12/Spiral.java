package praktikum12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Ringjoone valemi järgi ringi joonistamise näide
 * 
 * @author Mikk Mangus
 */
@SuppressWarnings("serial")
public class Spiral extends Applet {

	private Graphics g;

	public void paint(Graphics g) {
		this.g = g;
		fillBg();
		drawSpiral();
	}

	/**
	 * Katab tausta valgega
	 */
	public void fillBg() {
		int w = getWidth();
		int h = getHeight();
		g.setColor(Color.white);
		g.fillRect(0, 0, w, h);
	}

	/**
	 * Joonistab ringi
	 */
	public void drawSpiral() {
		g.setColor(Color.black);
		int centerX = getWidth() / 2;
		int centerY = getHeight() / 2;
		int radius = 50;

		for (double deg = 0; deg <= Math.PI * 2; deg = deg + .03) {
			radius += 1;
			int x = (int) (radius * Math.cos(deg));
			int y = (int) (radius * Math.sin(deg));
			g.fillRect(centerX + x, centerY + y, 2, 2);
		}
	}
}
