
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.util.Vector;



public class Menu {
	protected Vector options = new Vector(2, 1);
	protected int logoXK, logoYK;
	protected int zeileAbstand;
	protected Maler maler;
	protected Image logoimage;
	private int style = 0;
	private int xStyle = 0, yStyle = 1;
	private int x_KoordinateImage, y_KoordinateImage; // center
	private boolean waehlbar = true;
	private int fontSize = 30;
	public Font font;

	public Menu(Maler maler) {
		this.maler = maler;
		this.zeileAbstand = 20;
		this.logoimage = null;
	}

	public void addLogo(Image img) {
		((Menu) this).logoimage = img;
	}

	public void setLogoKoordinate(int x, int y) {
		((Menu) this).logoXK = x;
		((Menu) this).logoYK = y;
	}

	public void setKoordinateImage(int x, int y) {
		x_KoordinateImage = x;
		y_KoordinateImage = y;
	}

	public void setZeileAbstand(int ab) {
		((Menu) this).zeileAbstand = ab;
	}

	public void setStyle(int style) {
		((Menu) this).style = style;
		switch (style) {
		case 0:
			xStyle = 0;
			yStyle = 1;
			break;
		case 1:
			xStyle = 1;
			yStyle = 0;
			break;
		case 2:
			xStyle = 1;
			yStyle = 1;
			break;
		case 3:
			xStyle = 0;
			yStyle = 0;
		break;
		}
	}

	public void setWaehlbar(boolean waehlbar) {
		((Menu) this).waehlbar = waehlbar;
	}

	public void setFontSize(int size) {
		((Menu) this).fontSize = size;
	}

	public void add(String str, int prioritaet) {
		Vector temp = new Vector();
		if (options.size() > 0) {
			boolean insert = false;
			for (int i = 0; i < options.size(); i++) {
				if (prioritaet >= ((Option) options.elementAt(i)).prioritaet) {
					temp.addElement(options.elementAt(i));
				} else {
					temp.addElement(new Option(false, str, prioritaet));
					insert = true;
					for (int j = i; j < options.size(); j++) {
						temp.addElement(options.elementAt(j));
					}
					break;
				}
			}
			if (!insert) {
				temp.addElement(new Option(false, str, prioritaet));
			}
			options.removeAllElements();
			for (int i = 0; i < temp.size(); i++) {
				options.addElement(temp.elementAt(i));
				if (i == 0) {
					((Option) options.elementAt(i)).status = true;
				} else {
					((Option) options.elementAt(i)).status = false;
				}
			}
		} else {
			options.addElement(new Option(true, str, prioritaet));
		}
	}

	public void add(String str, Image img, int prioritaet) {
		Vector temp = new Vector();
		if (options.size() > 0) {
			boolean insert = false;
			for (int i = 0; i < options.size(); i++) {
				if (prioritaet >= ((Option) options.elementAt(i)).prioritaet) {
					temp.addElement(options.elementAt(i));
				} else {
					temp.addElement(new Option(false, str, prioritaet));
					insert = true;
					for (int j = i; j < options.size(); j++) {
						temp.addElement(options.elementAt(j));
					}
					break;
				}
			}
			if (!insert) {
				temp.addElement(new Option(false, str, prioritaet));
			}
			options.removeAllElements();
			for (int i = 0; i < temp.size(); i++) {
				options.addElement(temp.elementAt(i));
				if (i == 0) {
					((Option) options.elementAt(i)).status = true;
				} else {
					((Option) options.elementAt(i)).status = false;
				}
			}
		} else {
			options.addElement(new Option(true, str, prioritaet));
		}
	}

	public void add(String str, Image img, Image img2, int prioritaet) {
		Vector temp = new Vector();
		if (options.size() > 0) {
			boolean insert = false;
			for (int i = 0; i < options.size(); i++) {
				if (prioritaet >= ((Option) options.elementAt(i)).prioritaet) {
					temp.addElement(options.elementAt(i));
				} else {
					temp.addElement(new Option(false, str, img, img2, prioritaet));
					insert = true;
					for (int j = i; j < options.size(); j++) {
						temp.addElement(options.elementAt(j));
					}
					break;
				}
			}
			if (!insert) {
				temp.addElement(new Option(false, str, img, img2, prioritaet));
			}
			options.removeAllElements();
			for (int i = 0; i < temp.size(); i++) {
				options.addElement(temp.elementAt(i));
				if (i == 0) {
					((Option) options.elementAt(i)).status = true;
				} else {
					((Option) options.elementAt(i)).status = false;
				}
			}
		} else {
			options.addElement(new Option(true, str, img, img2, prioritaet));
		}

	}

	public void KeyBehandeln(int key) {
		if (key == 40 || key == 39) {
			for (int i = 0; i < options.size(); i++) {
				if (((Option) options.elementAt(i)).status == true) {
					((Option) options.elementAt(i)).status = false;
					if (i + 1 == options.size()) {
						((Option) options.elementAt(0)).status = true;
					} else {
						((Option) options.elementAt(i + 1)).status = true;
					}
					break;
				}
			}
		}
		if (key == 38 || key == 37) {
			for (int i = 0; i < options.size(); i++) {
				if (((Option) options.elementAt(i)).status == true) {
					((Option) options.elementAt(i)).status = false;
					if (i - 1 < 0) {
						((Option) options.elementAt(options.size() - 1)).status = true;
					} else {
						((Option) options.elementAt(i - 1)).status = true;
					}
					break;
				}
			}
		}
		if (key == 10) {
			if (waehlbar) {
				for (int i = 0; i < options.size(); i++) {
					if (((Option) options.elementAt(i)).status == true) {
						maler.menuBehandeln(((Option) options.elementAt(i)).str);
						break;
					}
				}
			} else {
				maler.menuBehandeln(((Option) options.elementAt(0)).str);
			}

		}
	}

	public void erscheinen(Graphics gTemp) {
		int x = 0, y = 0;
		Graphics2D g = (Graphics2D) gTemp;
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		font = new Font("Arial", Font.PLAIN, fontSize);
		gTemp.setFont(font);

		if (((Menu) this).logoimage != null) {
			gTemp.drawImage(logoimage, logoXK, logoYK, null);
		}

		gTemp.setColor(Color.GREEN);
		if (((Option) options.elementAt(0)).img == null) {

			for (int i = 0; i < options.size(); i++) {
				FontRenderContext frc = g.getFontRenderContext();
				Rectangle2D bounds = g.getFont().getStringBounds(
						((Option) options.elementAt(i)).str, frc);
				switch (style) {
				case 0:
					x = x_KoordinateImage - (int) bounds.getWidth() / 2;
					y = y_KoordinateImage
							- ((int) bounds.getHeight() * options.size() + zeileAbstand
									* (options.size() - 1)) / 2;
					break;
				case 1:
					x = x_KoordinateImage
							- ((int) bounds.getWidth() * options.size() + zeileAbstand
									* (options.size() - 1)) / 2;
					y = y_KoordinateImage - (int) bounds.getHeight() / 2;
					break;
				case 2:
					x = x_KoordinateImage
							- ((int) bounds.getWidth() * options.size() + zeileAbstand
									* (options.size() - 1)) / 2;
					y = y_KoordinateImage
							- ((int) bounds.getHeight() * options.size() + zeileAbstand
									* (options.size() - 1)) / 2;
					break;
				case 3:
					x = x_KoordinateImage - (int) bounds.getWidth() / 2;
					y = y_KoordinateImage - (int) bounds.getHeight() / 2;
					break;
				}

				if (((Option) options.elementAt(i)).status == true) {
					gTemp.setColor(Color.green);
				} else {
					if (waehlbar) {
						gTemp.setColor(Color.red);
					}
				}
				gTemp.drawString(((Option) options.elementAt(i)).str, x + i * (zeileAbstand)
						* xStyle, y + i * (zeileAbstand + (int) bounds.getHeight()) * yStyle);
			}
		} else {
			switch (style) {
			case 0:
				x = x_KoordinateImage - ((Option) options.elementAt(0)).img.getWidth(null) / 2;
				y = y_KoordinateImage
						- (((Option) options.elementAt(0)).img.getHeight(null) * options.size() + zeileAbstand
								* (options.size() - 1)) / 2;
				break;
			case 1:
				x = x_KoordinateImage
						- (((Option) options.elementAt(0)).img.getWidth(null) * options.size() + zeileAbstand
								* (options.size() - 1)) / 2;
				y = y_KoordinateImage - ((Option) options.elementAt(0)).img.getHeight(null) / 2;
				break;
			case 2:
				x = x_KoordinateImage
						- (((Option) options.elementAt(0)).img.getWidth(null) * options.size() + zeileAbstand
								* (options.size() - 1)) / 2;
				y = y_KoordinateImage
						- (((Option) options.elementAt(0)).img.getHeight(null) * options.size() + zeileAbstand
								* (options.size() - 1)) / 2;
				break;
			case 3:
				x = x_KoordinateImage
						- ((Option) options.elementAt(0)).img.getWidth(null)
						/ 2;
				y = y_KoordinateImage
						- ((Option) options.elementAt(0)).img.getHeight(null)
						/ 2;
				break;
			}

			for (int i = 0; i < options.size(); i++) {
				if (((Option) options.elementAt(i)).status == true) {
					gTemp.drawImage(((Option) options.elementAt(i)).img2, x + i
							* (zeileAbstand + ((Option) options.elementAt(i)).img2.getWidth(null))
							* xStyle, y + i
							* (zeileAbstand + ((Option) options.elementAt(i)).img2.getHeight(null))
							* yStyle, null);
				} else {
					gTemp.drawImage(((Option) options.elementAt(i)).img, x + i
							* (zeileAbstand + ((Option) options.elementAt(i)).img2.getWidth(null))
							* xStyle, y + i
							* (zeileAbstand + ((Option) options.elementAt(i)).img2.getHeight(null))
							* yStyle, null);
				}
			}
		}

	}
}