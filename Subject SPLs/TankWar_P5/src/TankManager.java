
import java.util.Random;
import java.util.Vector;



abstract class TankManager$$TankWar extends MIDlet implements GameManager {

	public Maler maler;
	public int status = GameManager.MAIN_MENU;
	protected int screenWidth, screenHeight;
	protected int koernigkeit, koernigkeit2;
	protected String name;

	public Tank tank1;
	public Tank tank2;
	public Tank base;
	protected int lvl = 1;
	protected Vector tankMenge = new Vector();
	protected Vector missilesMenge = new Vector();
	protected Vector brickwall = new Vector(); //
	protected Vector metalwall = new Vector(); //
	protected Vector grasswall = new Vector(); //
	protected Vector waterwall = new Vector(); //

	protected Vector enemyPosition; 
	protected Vector enemyType;
	protected int playerPositionX;
	protected int playerPositionY;
	protected int bPositionX;
	protected int bPositionY;
	protected int tankAllNum;
	protected int tankMaxNum;
	protected int enemyTankNum;
	protected static Random random = new Random();
	protected boolean game = false;
	protected boolean mapReady = true;

	public static void main(String[] args) {
	//	(new Missile(new TankManager(), 1, 2, 3, 4, 5, 6, true, 8)).treffenErkennen();	//explodieren.Missile.explodieren() - Space({P3, P5})
		
		//(new TankManager()).malenkontrolle();	//FeuerKraft.Tool.init(TankManagerintintint) - Space({P1,P3,P5}), Re_fuer_PC.Maler.note(Vector) - Space({P1,P3,P4,P5})
		//Tool t = new Tool(new TankManager(), 1, 2, 3);	//Bombe.Tool.init(TankManagerintintint) - Space({P2,P4,P5)}
		//new TankManager();
		
//		(new TankManager()).addEnemyTank();			//TankWar.GameObject.stossenGegen(Vector) - Space({P1,P2,P3,P4,P5})

	}

	public TankManager$$TankWar() {
		init();

	}

	public void init() {
		maler = new Maler(((TankManager) this));
		maler.init();
		screenWidth = maler.getScreenWidth();
		screenHeight = maler.getScreenHeight();
		koernigkeit = screenWidth / 30;
		koernigkeit2 = koernigkeit / 2;
		new MalerZeit(((TankManager) this)).start();

		
	}

	public void aktualisieren() {
		maler.repaint();
	}

	public void keyPressBehandeln(int key) {

		if (status != GameManager.SPIELEN) {
			maler.keyPressedBehandeln(key);
		} else {
			if (key == 10) {
				((TankManager) this).setStatus(GameManager.PAUSE);
				maler.setStatus(GameManager.PAUSE);
			}
			if (key == 27) {
				((TankManager) this).setStatus(GameManager.EXIT);
				maler.setStatus(GameManager.EXIT);
			}
			if (tank1 != null)
				tank1.keyPressBehandeln(key);
		}
	}

	public void keyReleaseBehandeln(int key) {
		if (status == GameManager.SPIELEN) {
			if (tank1 != null)
				tank1.keyReleaseBehandeln(key);
		}

	}

	public void malenkontrolle() {
		switch (status) {
		case GameManager.MAIN_MENU:
			game = false;
			lvl = 1;
			maler.mainMenu();
			break;
		case GameManager.TANK_WAEHLEN:
			maler.tankWaehlen();
			break;
		case GameManager.HELP:
			maler.help();
			break;
		case GameManager.SPIELEN:
			komponenteMalen();
			break;
		case GameManager.PAUSE:
			komponenteMalen();
			maler.pause();
			break;
		case GameManager.LEVEL:
			maler.gameLevel(lvl);
			break;
		case GameManager.LOSE:
			komponenteMalen();
			maler.gameLose();
			break;
		case GameManager.EXIT:
			komponenteMalen();
			maler.gameExit();
			break;
		}
	}

	public void komponenteMalen() {
		if (!game) {
			mapLaden();
			tanksLaden();
			game = true;
		}
		if (mapReady) {
			addEnemyTank();
			if (tank1 == null) {
				((TankManager) this).setStatus(GameManager.LOSE);
				maler.setStatus(GameManager.LOSE);
			}
			if (base != null && base.energie <= 0) {
				((TankManager) ((TankManager) this)).setStatus(GameManager.LOSE);
				maler.setStatus(GameManager.LOSE);
			}
			if (tankAllNum + enemyTankNum == 0) {
				game = false;
				tankMenge.removeAllElements();
				((TankManager) this).setStatus(GameManager.LEVEL);
				maler.setStatus(GameManager.LEVEL);
			}
			gruppeMalen(brickwall);
			gruppeMalen(tankMenge);
			gruppeMalen(waterwall);
			gruppeMalen(missilesMenge);
			gruppeMalen(metalwall);
			gruppeMalen(grasswall);
			} else {
			((TankManager) this).setStatus(GameManager.WIN);
			maler.setStatus(GameManager.WIN);
		}
	}

	protected void gruppeMalen(Vector gruppe) {
		for (int i = 0; i < gruppe.size(); i++) {
			((GameObject) gruppe.elementAt(i)).malen();
		}
	}

	public void setStatus(int status) {
		((TankManager) this).status = status;
	}

	public void mapLaden() {
		tankMenge.removeAllElements();
		tank1 = null;
		tank2 = null;
		base = null;
		MapInfo map = new MapInfo(((TankManager) this), lvl++);
		mapReady = map.read;
		brickwall = map.brickWall;
		metalwall = map.metalWall;
		grasswall = map.grassWall;
		waterwall = map.waterWall;
		enemyPosition = map.enemyPosition;
		playerPositionX = map.playerLocationX;
		playerPositionY = map.playerLocationY;
		tankAllNum = map.enemyAllNr;
		tankMaxNum = map.enemyMaxNr;
		bPositionX = map.baseLocationX;
		bPositionY = map.baseLocationY;
		enemyType = map.enemyType;
	}

	public void tanksLaden() {
		if (mapReady) {
			int a = enemyPosition.size();
			int b = enemyType.size();
			// build tanks
			tank1 = new Tank(((TankManager) this), playerPositionX, playerPositionY, maler.tankType);
			tankMenge.addElement(tank1);
			if (bPositionX != 0) {
				base = new Tank(((TankManager) this), bPositionX, bPositionY, 00);
				tankMenge.addElement(base);
			}
			for (int i = 0; i < a; i++) {
				int z = Math.abs(random.nextInt() % b);// rand.nextInt(b);
				Integer tankTy = (Integer) enemyType.elementAt(z);
				int tankType = tankTy.intValue();
				Integer d = (Integer) enemyPosition.elementAt(i);
				int d2 = d.intValue();
				Tank enemyTank = new Tank(((TankManager) this), d2 / 100, d2 % 100, tankType);
				tankMenge.addElement(enemyTank);
				((TankManager) this).tankAllNum--;
			}
		}
	}

	public void addEnemyTank() {
		enemyTankNum=tankMenge.size()-(tank1==null?0:1)-(tank2==null?0:1)-(base==null?0:1);
		if (enemyTankNum < tankMaxNum && tankAllNum > 0) {
			int f = enemyPosition.size();
			int i = Math.abs(random.nextInt() % f);
			int g = enemyType.size();
			int h = Math.abs(random.nextInt() % g);
			Integer tankTy2 = (Integer) enemyType.elementAt(h);
			int tankType = tankTy2.intValue();
			Integer y = (Integer) enemyPosition.elementAt(i);
			int y2 = y.intValue();
			Tank enemyTank = new Tank(((TankManager) this), y2 / 100, y2 % 100, tankType);
			if (!enemyTank.stossenGegen(tankMenge)) {
				tankMenge.addElement(enemyTank);
				((TankManager) this).tankAllNum--;
			}
		}
	}
	
	public int getBlood(){
		if(tank1!=null){
			return tank1.energie/10;
		}
		return 0;
	}
	
	public int getTankMenge() {
		return (tankAllNum + enemyTankNum);
	}
}

abstract class TankManager$$Tools extends  TankManager$$TankWar  {

	protected Vector toolMenge = new Vector();
		
	public void komponenteMalen() {
		super.komponenteMalen();
		if (mapReady) {
			gruppeMalen(toolMenge);
			}
	}

	public void toolsLaden() {
		
	}

	public void toolInit(int type) {
		if (Math.abs(random.nextInt() % 300) == 0) {
			int x = Math.abs(random.nextInt() % 59);
			int y = Math.abs(random.nextInt() % 59);
			Tool tool = new Tool(((TankManager) this), x, y, type);
			if (!tool.stossenGegen(metalwall) && !tool.stossenGegen(waterwall)
					&& toolMenge.size() < 3) {
				toolMenge.addElement(tool);
			}
		}
	}
	
	public void addEnemyTank() {
		super.addEnemyTank();
		toolsLaden();
	}
      // inherited constructors 


 
	public TankManager$$Tools (  ) { super(); }

}

abstract class TankManager$$Bombe extends  TankManager$$Tools  {

	public void toolsLaden() {
		toolInit(374);
		super.toolsLaden();
	}
      // inherited constructors



	public TankManager$$Bombe (  ) { super(); }

}

abstract class TankManager$$Feuerkraft extends  TankManager$$Bombe  {

	public void toolsLaden() {
		toolInit(372); 
		super.toolsLaden();
	}
      // inherited constructors



	public TankManager$$Feuerkraft (  ) { super(); }
	

}

abstract class TankManager$$explodieren extends  TankManager$$Feuerkraft  {
	
	public Vector expEffekt = new Vector(2, 1);
	
	public void komponenteMalen() {
		super.komponenteMalen();
		if (mapReady) {gruppeMalen(expEffekt);}
	}
      // inherited constructors



	public TankManager$$explodieren (  ) { super(); }
	

}

public class TankManager extends  TankManager$$explodieren  {
	protected Record record;
	protected int tank1Score = 0;
	protected int tank2Score = 0;
	
	public void init() {
		super.init();
		record = new Record();
	}
			
	public void malenkontrolle() {
		super.malenkontrolle();
		switch(status){
		case GameManager.NOTE:
			maler.note(record.readNote());
			break;
		case GameManager.NAME_VERGEBEN:
			maler.nameVergeben();
			break;
		}
	}
	
	public void addScore(int id, int type) {
		if (id == tank1.id) {
			tank1Score += type * 5;
		}
	}

	public void writeScore() { 
		record.writeNote(maler.name, tank1Score);
		tank1Score = 0;
	}
      // inherited constructors



	public TankManager (  ) { super(); }
	
}