
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.ImageObserver;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.Random;

import javax.swing.JFrame;
import java.awt.TextField;



abstract class Maler$$PC extends Canvas {

	protected GameManager gameManager;
	protected int GAME_WIDTH;
	protected int GAME_HEIGHT;
	protected Graphics gTemp;
	protected Image offScreenImage;
	protected Menu menu;
	protected JFrame frame;
	protected InfoPanel infoPanel;
	protected int infoWidth;
	public int status;
	protected long time;
	public int tankType = 1;
 
	protected Toolkit tk = Toolkit.getDefaultToolkit();
	private Random random = new Random();

	public Maler$$PC(GameManager gameManager) { 
		this.gameManager = gameManager;
	}

	public void init() {
		gamesize();
		infoPanel = new InfoPanel(((Maler) this));
		infoWidth = InfoPanel.INFO_WIDTH;
		((Maler) this).setSize(GAME_WIDTH + infoWidth, GAME_HEIGHT);
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.add(((Maler) this));
		((Maler) this).setBackground(Color.black);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.addKeyListener(new KeyMonitor(gameManager));
		((Maler) this).addKeyListener(frame.getKeyListeners()[0]);
	}
	
	protected void gamesize(){
		
	}

	public void paint(Graphics g) {
		gTemp = g;
		Color c = g.getColor();
		gameManager.malenkontrolle();
		g.setColor(c);
	}

	public void mainMenu() {
		if (menu == null) {
			mainMenuerstellen();
		}
		menu.erscheinen(gTemp);
	}

	public void mainMenuerstellen() {
		((Maler) this).setSize(GAME_WIDTH + infoWidth, GAME_HEIGHT);
		frame.pack();
		menu = new Menu(((Maler) this));
		menu.add(Sprach.START, 0);
		menu.add(Sprach.HELP, 10);
		menu.add(Sprach.EXIT, 11);
		menu.setStyle(0);
		menu.setKoordinateImage((GAME_WIDTH + infoWidth) / 2, GAME_HEIGHT * 2 / 3);
		menu.setZeileAbstand(0);
		menu.addLogo(loadImage("15.png",(GAME_WIDTH + infoWidth),GAME_HEIGHT));
		menu.setLogoKoordinate(0, 0);
	}
		
	public void tankWaehlen() {
		if (menu == null) {
			tankErstellen();
		}
		menu.erscheinen(gTemp);
	}

	protected void tankErstellen() {
		menu = new Menu(((Maler) this));
		menu.addLogo(loadImage("15.png",(GAME_WIDTH + infoWidth),GAME_HEIGHT));
		menu.setStyle(1);
		menu.setZeileAbstand(0);
		menu.setKoordinateImage((GAME_WIDTH + infoWidth) / 2, GAME_HEIGHT*2/ 3);
		
	}
	
	public void help() {
		if (menu == null) {
			helpItemErstellen();
		}
		menu.erscheinen(gTemp);
	}

	public void helpItemErstellen() {
		menu = new Menu(((Maler) this));
		menu.add(Sprach.HelpItem, loadImage("transparent.png",0,0),loadImage("help.png",0,0), 0);
		menu.setStyle(3);
		menu.setKoordinateImage((GAME_WIDTH + infoWidth) / 2, GAME_HEIGHT / 2);
	}
	
	public Image loadImage(String str, int a, int b) {
		Image tempimage = tk.getImage(Tank.class.getClassLoader().getResource(
				"images/" + str));
		if (a == 0 && b == 0) {
			return tempimage;
		}
		return tempimage.getScaledInstance(a, b, Image.SCALE_FAST);
	}
	
	protected void gameLevel(int lvl) {
		if (menu == null) {
			time = System.currentTimeMillis();
			frame.remove(infoPanel);
			((Maler) this).setSize(GAME_WIDTH + infoWidth, GAME_HEIGHT);
			frame.pack();
			menu = new Menu(((Maler) this));
			menu.setKoordinateImage((GAME_WIDTH + infoWidth) / 2, GAME_HEIGHT / 2);
			menu.setZeileAbstand(0);
			menu.add(Sprach.LEVEL, 0);
			menu.add(lvl + "", 1);
			menu.setWaehlbar(false);
			menu.setFontSize(70);
			menu.setStyle(0);
			menu.setZeileAbstand(55);
		}
		menu.erscheinen(gTemp);
		if (System.currentTimeMillis() - time > 2000) {
			gamescreenstart();
			menu = null;
		}

	}
	
	public void gameLose() {
		if (menu == null) {
			time = System.currentTimeMillis();
			menu = new Menu(((Maler) this));
			menu.setKoordinateImage((GAME_WIDTH + infoWidth) / 2, GAME_HEIGHT / 2);
			menu.setZeileAbstand(0);
			menu.add(Sprach.LOSE, 0);
			menu.setFontSize(70);
			menu.setStyle(0);
			menu.setZeileAbstand(55);
		}
		menu.erscheinen(gTemp);
		if (System.currentTimeMillis() - time > 3000) {
			frame.remove(infoPanel);
			((Maler) this).setSize(GAME_WIDTH + infoWidth, GAME_HEIGHT);
			frame.pack();
			((Maler) this).setStatus(GameManager.MAIN_MENU);
			gameManager.setStatus(gameManager.MAIN_MENU);
			menu = null;
		}

	}
	
	protected void gameWin() {
		if (menu == null) {
			time = System.currentTimeMillis();
			frame.remove(infoPanel);
			((Maler) this).setSize(GAME_WIDTH + infoWidth, GAME_HEIGHT);
			frame.pack();
			menu = new Menu(((Maler) this));
			menu.setKoordinateImage((GAME_WIDTH + infoWidth) / 2, GAME_HEIGHT / 2);
			menu.setZeileAbstand(0);
			menu.add(Sprach.WIN, 0);
			menu.setFontSize(80);
			menu.setStyle(0);
			menu.setZeileAbstand(55);
		}
		menu.erscheinen(gTemp);
		if (System.currentTimeMillis() - time > 3000) {
			((Maler) this).setStatus(GameManager.MAIN_MENU);
			((Maler) this).gameManager.setStatus(GameManager.MAIN_MENU);
			menu = null;
		}

	}
	
	public void gameExit() {
		if (menu == null) {
			frame.remove(infoPanel);
			((Maler) this).setSize(GAME_WIDTH + infoWidth, GAME_HEIGHT);
			frame.pack();
			menu = new Menu(((Maler) this));
			menu.setKoordinateImage((GAME_WIDTH + infoWidth) / 2, GAME_HEIGHT / 2);
			menu.setZeileAbstand(0);
			menu.add(Sprach.MAIN_MENU, 1);
			menu.add(Sprach.RESUME, 0);
			menu.setStyle(0);
			menu.setZeileAbstand(55);
		}
		menu.erscheinen(gTemp);
	}

	private void gamescreenstart() {
		((Maler) this).setStatus(GameManager.SPIELEN);
		((Maler) this).gameManager.setStatus(GameManager.SPIELEN);
		((Maler) this).setSize(GAME_WIDTH, GAME_HEIGHT);
		frame.add(BorderLayout.EAST, ((Maler) this).infoPanel);
		frame.pack();
		menu = null;
	}

	public void pause() {
		if (menu == null) {
			menu = new Menu(((Maler) this));
			menu.setKoordinateImage((GAME_WIDTH + infoWidth) / 2, GAME_HEIGHT / 2);
			menu.setZeileAbstand(0);
			menu.add(Sprach.PAUSE, 0);
			menu.setStyle(0);
			menu.setZeileAbstand(55);
		}
		menu.erscheinen(gTemp);
	}

	public void keyPressedBehandeln(int key) {
		if (menu != null) {
			menu.KeyBehandeln(key);
			//System.out.println(key);
		}
	}

	public void menuBehandeln(String option) {
		//System.out.println(option);
		if (option.equals(Sprach.START)) {
			((Maler) this).setStatus(GameManager.TANK_WAEHLEN);
			((Maler) this).gameManager.setStatus(GameManager.TANK_WAEHLEN);
			menu = null;
		}
		if (option.equals(Sprach.MAIN_MENU)) {
			((Maler) this).setStatus(GameManager.MAIN_MENU);
			((Maler) this).gameManager.setStatus(GameManager.MAIN_MENU);
			menu = null;
		}
		if (option.equals(Sprach.NOTE)) {
			((Maler) this).setStatus(GameManager.NOTE);
			((Maler) this).gameManager.setStatus(GameManager.NOTE);
			menu = null;
		}
		if (option.equals(Sprach.HNOTE)) {
			((Maler) this).setStatus(GameManager.MAIN_MENU);
			((Maler) this).gameManager.setStatus(GameManager.MAIN_MENU);
			menu = null;
		}
		if (option.equals(Sprach.HELP)) {
			((Maler) this).setStatus(GameManager.HELP);
			gameManager.setStatus(GameManager.HELP);
			menu = null;
		}
		if (option.equals(Sprach.HelpItem)) {
			((Maler) this).setStatus(GameManager.MAIN_MENU);
			((Maler) this).gameManager.setStatus(GameManager.MAIN_MENU);
			menu = null;
		}
		if (option.equals(Sprach.EXIT)) {
			System.exit(0);
		}
		if (option.equals(Sprach.PAUSE)) {
			((Maler) this).setStatus(GameManager.SPIELEN);
			((Maler) this).gameManager.setStatus(GameManager.SPIELEN);
			menu = null;
		}
		if (option.equals(Sprach.RESUME)) {
			gamescreenstart();
		}
		if (option.equals(Sprach.TANKA)) {
			menu = null;
			tankType = 01;
			((Maler) this).setStatus(GameManager.LEVEL);
			gameManager.setStatus(GameManager.LEVEL);
		}
		if (option.equals(Sprach.TANKB)) {
			menu = null;
			tankType = 02;
			((Maler) this).setStatus(GameManager.LEVEL);
			gameManager.setStatus(GameManager.LEVEL);
		}
		if (option.equals(Sprach.TANKC)) {
			menu = null;
			tankType = 03;
			((Maler) this).setStatus(GameManager.LEVEL);
			gameManager.setStatus(GameManager.LEVEL);
		}
	}

	public void keyReleased(int key) {
		((Maler) this).repaint();
	}

	public void update(Graphics g) {
		if (offScreenImage == null) {
			offScreenImage = ((Maler) this).createImage(GAME_WIDTH + InfoPanel.INFO_WIDTH, GAME_HEIGHT);
		}
		Graphics gOffScreen = offScreenImage.getGraphics();
		Color c = gOffScreen.getColor();
		gOffScreen.setColor(Color.black);
		gOffScreen.fillRect(0, 0, GAME_WIDTH + InfoPanel.INFO_WIDTH, GAME_HEIGHT);
		gOffScreen.setColor(c);
		paint(gOffScreen);
		g.drawImage(offScreenImage, 0, 0, null);
		infoPanel.repaint();
	}

	public int getScreenWidth() {
		return GAME_WIDTH;
	}

	public int getScreenHeight() {
		return GAME_HEIGHT;
	}

	public void setColor(int R, int G, int B) {
		Color c = new Color(R, G, B);
		gTemp.setColor(c);
	}

	public void setStatus(int status) {
		((Maler) this).status = status;
	}

	public void fillOvall(int x, int y, int width, int height) {
		gTemp.fillOval(x, y, width, height);

	}

	public void fillRect(int x, int y, int width, int height) {
		gTemp.fillRect(x, y, width, height);

	}

	public void drawLine(int x1, int y1, int x2, int y2) {
		gTemp.drawLine(x1, y1, x2, y2);

	}

	public void drawRect(int x, int y, int width, int height) {
		gTemp.drawRect(x, y, width, height);
	}

	public void drawRoundRect(int x, int y, int width, int height, int arcw, int arch) {
		gTemp.drawRoundRect(x, y, width, height, arcw, arch);
	}

	
}

abstract class Maler$$Bombe extends  Maler$$PC  {

	public void helpItemErstellen() {
		super.helpItemErstellen();
		menu.add(Sprach.HelpItem, loadImage("transparent.png",0,0),loadImage("Bombe.png",0,0), 0);
	}
      // inherited constructors



	public Maler$$Bombe ( GameManager gameManager ) { super(gameManager); }
}

abstract class Maler$$Feuerkraft extends  Maler$$Bombe  {

	public void helpItemErstellen() {
		super.helpItemErstellen();
		menu.add(Sprach.HelpItem, loadImage("transparent.png",0,0),loadImage("Feuerkraft.png",0,0), 0);
	}
      // inherited constructors



	public Maler$$Feuerkraft ( GameManager gameManager ) { super(gameManager); }

}

abstract class Maler$$M_600 extends  Maler$$Feuerkraft  {
	
	protected void gamesize(){
		GAME_WIDTH=600;
		GAME_HEIGHT=600;
	}
      // inherited constructors



	public Maler$$M_600 ( GameManager gameManager ) { super(gameManager); }

}

abstract class Maler$$fuer_PC extends  Maler$$M_600  {
	protected Map images = new HashMap();
	public void drawImage(String imageFileName, int x, int y) {
		int xw = GAME_WIDTH / 60;
		int yh = GAME_HEIGHT / 60;
		Image temp = (Image) images.get(imageFileName);
		if (temp != null) {
			gTemp.drawImage(temp, x, y, null);
		} else {
			System.out.println(imageFileName + "----------" + "null");
			try {
				// ---------------------------
				if (imageFileName.equals("gh")) {
					loadimage("gh", "gh.png", 7 * xw, 7 * yh);
				}
				// --------------------------
				if (imageFileName.equals("31.png")) {
					loadimage("31.png", "brickWall.png", 2 * xw, 2 * yh);
				}
				if (imageFileName.equals("32.png")) {
					loadimage("32.png", "grassWall.png", 2 * xw, 2 * yh);
				}
				if (imageFileName.equals("33.png")) {
					loadimage("33.png", "metalWall.png", 2 * xw, 2 * yh);
				}
				if (imageFileName.equals("34.png")) {
					loadimage("34.png", "waterWall.png", 2 * xw, 2 * yh);
				}
				// -----------------------------------------
				if (imageFileName.equals("explode1.png")) {
					loadimage("explode1.png", "explode1.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode2.png")) {
					loadimage("explode2.png", "explode2.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode3.png")) {
					loadimage("explode3.png", "explode3.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode4.png")) {
					loadimage("explode4.png", "explode4.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode5.png")) {
					loadimage("explode5.png", "explode5.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode6.png")) {
					loadimage("explode6.png", "explode6.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode7.png")) {
					loadimage("explode7.png", "explode7.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode8.png")) {
					loadimage("explode8.png", "explode8.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode9.png")) {
					loadimage("explode9.png", "explode9.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode10.png")) {
					loadimage("explode10.png", "explode10.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode11.png")) {
					loadimage("explode11.png", "explode11.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode12.png")) {
					loadimage("explode12.png", "explode12.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode13.png")) {
					loadimage("explode13.png", "explode13.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode14.png")) {
					loadimage("explode14.png", "explode14.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode15.png")) {
					loadimage("explode15.png", "explode15.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode16.png")) {
					loadimage("explode16.png", "explode16.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode17.png")) {
					loadimage("explode17.png", "explode17.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode18.png")) {
					loadimage("explode18.png", "explode18.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode19.png")) {
					loadimage("explode19.png", "explode19.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode20.png")) {
					loadimage("explode20.png", "explode20.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode21.png")) {
					loadimage("explode21.png", "explode21.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode22.png")) {
					loadimage("explode22.png", "explode22.png", 6 * xw, 6 * yh);
				}
				if (imageFileName.equals("explode23.png")) {
					loadimage("explode23.png", "explode23.png", 6 * xw, 6 * yh);
				}
				// -------------------------
				if (imageFileName.equals("missileU.png")) {
					loadimage("missileU.png", "missileU.png", xw, 2 * yh);
				}
				if (imageFileName.equals("missileD.png")) {
					loadimage("missileD.png", "missileD.png", xw, 2 * yh);
				}
				if (imageFileName.equals("missileL.png")) {
					loadimage("missileL.png", "missileL.png", 2 * xw, yh);
				}
				if (imageFileName.equals("missileR.png")) {
					loadimage("missileR.png", "missileR.png", 2 * xw, yh);
				}
				// --------------------------------Tools
				if (imageFileName.equals("370")) {
					loadimage("370", "acc.png", 2 * xw, 2 * yh);
				}
				if (imageFileName.equals("371")) {
					loadimage("371", "allstop.png", 2 * xw, 2 * yh);
				}
				if (imageFileName.equals("372")) {
					loadimage("372", "macc.png", 2 * xw, 2 * yh);
				}
				if (imageFileName.equals("373")) {
					loadimage("373", "blood.png", 2 * xw, 2 * yh);
				}
				if (imageFileName.equals("374")) {
					loadimage("374", "bomb.png", 2 * xw, 2 * yh);
				}
				if (imageFileName.equals("375")) {
					loadimage("375", "mars.png", 2 * xw, 2 * yh);
				}
				// -----------------------------------
				if (imageFileName.equals("01U")) {
					loadimage("01U", "playerTank01U.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("01D")) {
					loadimage("01D", "playerTank01D.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("01L")) {
					loadimage("01L", "playerTank01L.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("01R")) {
					loadimage("01R", "playerTank01R.png", 3 * xw, 3 * yh);
				}
				
				if (imageFileName.equals("02U")) {
					loadimage("02U", "playerTank02U.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("02D")) {
					loadimage("02D", "playerTank02D.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("02L")) {
					loadimage("02L", "playerTank02L.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("02R")) {
					loadimage("02R", "playerTank02R.png", 3 * xw, 3 * yh);
				}

				if (imageFileName.equals("03U")) {
					loadimage("03U", "playerTank03U.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("03D")) {
					loadimage("03D", "playerTank03D.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("03L")) {
					loadimage("03L", "playerTank03L.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("03R")) {
					loadimage("03R", "playerTank03R.png", 3 * xw, 3 * yh);
				}
				// ----------------------------------
				if (imageFileName.equals("11U")) {
					loadimage("11U", "enemyTank11U.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("11D")) {
					loadimage("11D", "enemyTank11D.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("11L")) {
					loadimage("11L", "enemyTank11L.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("11R")) {
					loadimage("11R", "enemyTank11R.png", 3 * xw, 3 * yh);
				}

				if (imageFileName.equals("12U")) {
					loadimage("12U", "enemyTank12U.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("12D")) {
					loadimage("12D", "enemyTank12D.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("12L")) {
					loadimage("12L", "enemyTank12L.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("12R")) {
					loadimage("12R", "enemyTank12R.png", 3 * xw, 3 * yh);
				}

				if (imageFileName.equals("13U")) {
					loadimage("13U", "enemyTank13U.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("13D")) {
					loadimage("13D", "enemyTank13D.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("13L")) {
					loadimage("13L", "enemyTank13L.png", 3 * xw, 3 * yh);
				}
				if (imageFileName.equals("13R")) {
					loadimage("13R", "enemyTank13R.png", 3 * xw, 3 * yh);
				}
				// -------------------------------21,24,25
				if (imageFileName.equals("21U")) {
					loadimage("21U", "enemyBoss21U.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("21D")) {
					loadimage("21D", "enemyBoss21D.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("21L")) {
					loadimage("21L", "enemyBoss21L.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("21R")) {
					loadimage("21R", "enemyBoss21R.png", 4 * xw, 4 * yh);
				}

				if (imageFileName.equals("24U")) {
					loadimage("24U", "enemyBoss24U.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("24D")) {
					loadimage("24D", "enemyBoss24D.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("24L")) {
					loadimage("24L", "enemyBoss24L.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("24R")) {
					loadimage("24R", "enemyBoss24R.png", 4 * xw, 4 * yh);
				}

				if (imageFileName.equals("25U")) {
					loadimage("25U", "enemyBoss25U.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("25D")) {
					loadimage("25D", "enemyBoss25D.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("25L")) {
					loadimage("25L", "enemyBoss25L.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("25R")) {
					loadimage("25R", "enemyBoss25R.png", 4 * xw, 4 * yh);
				}

				if (imageFileName.equals("22U")) {
					loadimage("22U", "enemyBoss22U.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("22D")) {
					loadimage("22D", "enemyBoss22D.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("22L")) {
					loadimage("22L", "enemyBoss22L.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("22R")) {
					loadimage("22R", "enemyBoss22R.png", 4 * xw, 4 * yh);
				}

				if (imageFileName.equals("26U")) {
					loadimage("26U", "enemyBoss26U.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("26D")) {
					loadimage("26D", "enemyBoss26D.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("26L")) {
					loadimage("26L", "enemyBoss26L.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("26R")) {
					loadimage("26R", "enemyBoss26R.png", 4 * xw, 4 * yh);
				}

				if (imageFileName.equals("27U")) {
					loadimage("27U", "enemyBoss27U.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("27D")) {
					loadimage("27D", "enemyBoss27D.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("27L")) {
					loadimage("27L", "enemyBoss27L.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("27R")) {
					loadimage("27R", "enemyBoss27R.png", 4 * xw, 4 * yh);
				}

				if (imageFileName.equals("23U")) {
					loadimage("23U", "enemyBoss23U.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("23D")) {
					loadimage("23D", "enemyBoss23D.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("23L")) {
					loadimage("23L", "enemyBoss23L.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("23R")) {
					loadimage("23R", "enemyBoss23R.png", 4 * xw, 4 * yh);
				}

				if (imageFileName.equals("28U")) {
					loadimage("28U", "enemyBoss28U.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("28D")) {
					loadimage("28D", "enemyBoss28D.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("28L")) {
					loadimage("28L", "enemyBoss28L.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("28R")) {
					loadimage("28R", "enemyBoss28R.png", 4 * xw, 4 * yh);
				}

				if (imageFileName.equals("29U")) {
					loadimage("29U", "enemyBoss29U.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("29D")) {
					loadimage("29D", "enemyBoss29D.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("29L")) {
					loadimage("29L", "enemyBoss29L.png", 4 * xw, 4 * yh);
				}
				if (imageFileName.equals("29R")) {
					loadimage("29R", "enemyBoss29R.png", 4 * xw, 4 * yh);
				}
				// -----------------------------------
				if (imageFileName.equals("base")) {
					loadimage("base", "base.png", 2 * xw, 2 * yh);
				}
				// -----------------------------------

			} catch (Exception exception) {
				System.out.println(exception);
			}
			temp = (Image) images.get(imageFileName);
			if (temp != null) {
				gTemp.drawImage(temp, x, y, null);
			}
		}

	}

	public void loadimage(String id, String imagename, int a, int b) {
		Image image = tk.getImage(Tank.class.getClassLoader().getResource(
				"images/" + imagename));
		images.put(id, image.getScaledInstance(a, b, Image.SCALE_FAST));
	}
      // inherited constructors



	public Maler$$fuer_PC ( GameManager gameManager ) { super(gameManager); }
	
}



abstract class Maler$$Re_fuer_PC extends  Maler$$fuer_PC  {

	protected TextField textField;
	public String name = "";
	

	protected void note(Vector note) {
		//**Space({TankWar_P4, TankWar_P3, TankWar_P5, TankWar_P1}) delete
		if (menu == null) {
		//**Space({TankWar_P4, TankWar_P3, TankWar_P5, TankWar_P1}) add
	//	if (menu != null) {
			menu = new Menu(((Maler) this));
			menu.setKoordinateImage((GAME_WIDTH + infoWidth) / 2, GAME_HEIGHT / 2);
			menu.setZeileAbstand(0);
			menu.setWaehlbar(false);
			menu.add(Sprach.HNOTE, 0);
			for (int i = 0; i < note.size(); i++) {
				menu.add(
						((Note) note.elementAt(i)).name + "----" + ((Note) note.elementAt(i)).note,
						0);
			}

		}
		menu.erscheinen(gTemp); 
	}
	
	public void nameVergeben() {
		if (menu == null) {
			menu = new Menu(((Maler) this));
			menu.add(Sprach.Name, 0);
			menu.setKoordinateImage((GAME_WIDTH + infoWidth) / 2, GAME_HEIGHT / 2);
			textField = new TextField();

			textField.setBackground(Color.black);
			textField.setForeground(Color.red);
			textField.setSize(100, 40);
			textField.setLocation((GAME_WIDTH + infoWidth) / 2 - 50, GAME_HEIGHT / 2);
			textField.addKeyListener(frame.getKeyListeners()[0]);
			textField.setFont(new Font("Arial", Font.PLAIN, 25));

			frame.add(textField);
			frame.add(BorderLayout.CENTER, ((Maler) this));
			frame.pack();
			textField.requestFocus();
		}
		menu.erscheinen(gTemp);
	}
	
	public void gameLose() {
		super.gameLose();
		if (System.currentTimeMillis() - time > 3000) {
			gameManager.writeScore();
		}
	}
	
	protected void gameWin() {
		super.gameWin();
		if (System.currentTimeMillis() - time > 3000) {
			gameManager.writeScore();
		}
	}
	
	public void menuBehandeln(String option) {
		super.menuBehandeln(option);
		if (option.equals(Sprach.Name)) {
			((Maler) this).setStatus(GameManager.TANK_WAEHLEN);
			((Maler) this).gameManager.setStatus(GameManager.TANK_WAEHLEN);
			((Maler) this).name = textField.getText();
			((Maler) this).requestFocus();
			textField.setVisible(false);
			menu = null;
		}
		if (option.equals(Sprach.MAIN_MENU)) {
			gameManager.writeScore();
		}
		if (option.equals(Sprach.START)) {
			((Maler) this).setStatus(GameManager.NAME_VERGEBEN);
			((Maler) this).gameManager.setStatus(GameManager.NAME_VERGEBEN);
			menu = null;
		}
			
		}
	public void mainMenuerstellen() {
		super.mainMenuerstellen();
		menu.add(Sprach.NOTE, 9);
	}
      // inherited constructors



	public Maler$$Re_fuer_PC ( GameManager gameManager ) { super(gameManager); }
}

public class Maler extends  Maler$$Re_fuer_PC  {

	protected void tankErstellen(){
		super.tankErstellen();
		int x, y;
		//**Space({TankWar_P3, TankWar_P5, TankWar_P2, TankWar_P1}) delete
		x = GAME_WIDTH * 2 / 3 / 3;
		y = (int) (2.5 * x);
				
		//**Space({TankWar_P3, TankWar_P5, TankWar_P2, TankWar_P1}) add
		//x = GAME_WIDTH * 2 * 3 / 3;
		//y = (int) (2.5 / x);
		menu.add(Sprach.TANKA, loadImage("choice11.png",x,y), loadImage("choice01.png",x,y), 0);
	}
      // inherited constructors



	public Maler ( GameManager gameManager ) { super(gameManager); }
}