
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;



public class InfoPanel extends Canvas {

	private Maler maler;
	public JPanel behalter;
	public static int INFO_WIDTH = 100;

	public InfoPanel(Maler maler) {
		this.maler = maler;
		this.setSize(INFO_WIDTH, 50);
		this.setBackground(Color.gray);
		this.behalter = new JPanel();
		behalter.add(BorderLayout.NORTH, this);
	}
 
	public void paint(Graphics g) {
		if (maler.status == 1 || maler.status == 2) {
			((InfoPanel) this).setBackground(Color.gray);
			Color c = g.getColor();
			g.setColor(Color.green);
			g.drawString("Information:", 20, 20);
			g.setColor(c);
					
			if (maler.gameManager.getBlood() != 0) {
				g.drawString("MyTank Life: " + maler.gameManager.getBlood(), 5,
						20 + 40);
				g.setColor(Color.red);

				g.fillRect(5, 20 + 45, 5 * 2 * maler.gameManager.getBlood(), 5);
				g.setColor(Color.green);
				g.drawString("Tanks:" + maler.gameManager.getTankMenge(), 5,
						20 + 70);
			} else {
				g.drawString("-+---You Lose!---+-", 5, 20 + 40);
				g.setColor(Color.red);
				g.drawRect(5, 20 + 45, 10 * 2 * 5, 5);
				g.fillRect(5, 20 + 45, 10 * 2 * 0, 5);
			}
		}
		if (maler.status == 3) {
			((InfoPanel) ((InfoPanel) this)).setBackground(Color.black);
		}

	}
}