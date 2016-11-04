package praktikum12;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Gradient extends Applet {

	@Override
	public void paint(Graphics g) {

		int w = getWidth();
		int h = getHeight();

		for (int y = 0; y < h; y++) {
			double concentrate = (double) y / h; // 0..1
			concentrate = 1 - concentrate; // 1..0
			// juice = 255..0
			int juice = (int) (concentrate * 255);
			Color color = new Color(juice, juice, juice);
			g.setColor(color);
			g.drawLine(0, y, w, y);

		}

	}
}