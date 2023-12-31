

abstract class ExplodierenEffekt$$TankWar extends GameObject {
	
}

abstract class ExplodierenEffekt$$explodieren extends  ExplodierenEffekt$$TankWar  {

	private int i = 30;
	private int[] x = new int[12], y = new int[12];
	int koernigKeit;
	
	
	int step = 0;

	public ExplodierenEffekt$$explodieren(TankManager tankManager, int x_Koordinate, int y_Koordinate) {
		init(tankManager, x_Koordinate, y_Koordinate);
	}

	protected void init(TankManager tankManager, int x_koordinate, int y_koordinate) {

		((ExplodierenEffekt) this).tankManager = tankManager;
		((ExplodierenEffekt) this).x_Koordinate = x_koordinate;
		((ExplodierenEffekt) this).y_Koordinate = y_koordinate;
		((ExplodierenEffekt) this).koernigKeit = tankManager.screenWidth / 60; 

		int koernigKeit2 = koernigKeit * 2;

		int koernigKeit4 = koernigKeit * 4;
		int koernigKeit6 = koernigKeit * 6;
		int koernigKeit7 = koernigKeit * 7;

		x[0] = x_Koordinate + koernigKeit2;
		y[0] = y_koordinate;
		x[1] = x_Koordinate + koernigKeit4;
		y[1] = y_koordinate + koernigKeit2;
		x[2] = x_Koordinate + koernigKeit2;
		y[2] = y_koordinate + koernigKeit4;
		x[3] = x_Koordinate;
		y[3] = y_koordinate + koernigKeit2;
		x[4] = x_Koordinate + koernigKeit2;
		y[4] = y_koordinate - koernigKeit * 3;
		x[5] = x_Koordinate + koernigKeit6;
		y[5] = y_koordinate - koernigKeit2;
		x[6] = x_Koordinate + koernigKeit7;
		y[6] = y_koordinate + koernigKeit2;
		x[7] = x_Koordinate + koernigKeit6;
		y[7] = y_koordinate + koernigKeit6;
		x[8] = x_Koordinate + koernigKeit2;
		y[8] = y_koordinate + koernigKeit7;
		x[9] = x_Koordinate - koernigKeit2;
		y[9] = y_koordinate + koernigKeit6;
		x[10] = x_Koordinate - koernigKeit * 3;
		y[10] = y_koordinate + koernigKeit2;
		x[11] = x_Koordinate - koernigKeit2;
		y[11] = y_koordinate - koernigKeit2;

	}

	public void malen() {
		 int c = Math.abs(i % 3);
		switch (c) {
		case 0:
			tankManager.maler.setColor(255, 0, 0);
			break;
		case 1:
			tankManager.maler.setColor(0, 255, 0);
			break;
		case 2:
			tankManager.maler.setColor(0, 0, 255);
			break;
		}

		fillTriangle(x[4], y[4], x[3], y[3], x[1], y[1]);
		fillTriangle(x[3], y[3], x[5], y[5], x[2], y[2]);
		fillTriangle(x[0], y[0], x[6], y[6], x[2], y[2]);
		fillTriangle(x[0], y[0], x[7], y[7], x[3], y[3]);
		fillTriangle(x[1], y[1], x[8], y[8], x[3], y[3]);
		fillTriangle(x[1], y[1], x[9], y[9], x[0], y[0]);
		fillTriangle(x[2], y[2], x[10], y[10], x[0], y[0]);
		fillTriangle(x[2], y[2], x[11], y[11], x[1], y[1]);

		i--;
		if (i == 0)
			explodieren();

	}

	public void fillTriangle(int i, int j, int k, int l, int i1, int j1) {
		int ai[] = new int[4];
		int ai1[] = new int[4];
		ai[0] = i;
		ai[1] = k;
		ai[2] = i1;
		ai1[0] = j;
		ai1[1] = l;
		ai1[2] = j1;
		if (ai[0] > ai[1]) {
			ai[3] = ai[1];
			ai1[3] = ai1[1];
			ai[1] = ai[0];
			ai1[1] = ai1[0];
			ai[0] = ai[3];
			ai1[0] = ai1[3];
		}
		if (ai[1] > ai[2]) {
			ai[3] = ai[2];
			ai1[3] = ai1[2];
			ai[2] = ai[1];
			ai1[2] = ai1[1];
			ai[1] = ai[3];
			ai1[1] = ai1[3];
		}
		if (ai[0] > ai[1]) {
			ai[3] = ai[1];
			ai1[3] = ai1[1];
			ai[1] = ai[0];
			ai1[1] = ai1[0];
			ai[0] = ai[3];
			ai1[0] = ai1[3];
		}
		int k1 = (ai1[1] - ai1[0]) * 2 + 1;
		int l1 = ai[1] - ai[0];
		int i2 = (ai1[2] - ai1[0]) * 2 + 1;
		int j2 = ai[2] - ai[0];
		int k2 = (ai1[2] - ai1[1]) * 2 + 1;
		int l2 = ai[2] - ai[1];
		if (l1 != 0 && j2 != 0) {
			for (int i3 = 0; i3 < l1; i3++) {
				int k3 = i3 + ai[0];
				int i4 = (k1 * i3) / l1 / 2 + ai1[0];
				int k4 = (i2 * i3) / j2 / 2 + ai1[0];
				tankManager.maler.drawLine(k3, i4, k3, k4);

			}
		}
		if (l2 != 0 && j2 != 0) {
			for (int j3 = 0; j3 <= l2; j3++) {
				int l3 = j3 + ai[1];
				int j4 = (k2 * j3) / l2 / 2 + ai1[1];
				int l4 = (i2 * (j3 + l1)) / j2 / 2 + ai1[0];
				tankManager.maler.drawLine(l3, j4, l3, l4);
			}
		}
	}

	protected void explodieren() {
		tankManager.expEffekt.removeElement(((ExplodierenEffekt) this));

	}

}

public class ExplodierenEffekt extends  ExplodierenEffekt$$explodieren  {
	private static boolean init = false;
	protected boolean live = true; 
	int step=0;

	public void malen(){
	if (!init) {
			for (int i = 0; i < 23; i++) {
				tankManager.maler.drawImage("explode" + (i + 1) + ".png", x_Koordinate - 2
						* tankManager.koernigkeit2, y_Koordinate - 2 * tankManager.koernigkeit2); // modify
				// the
				// position
				// of
				// Explodes
			}
			init = true;
		}

		if (!live) {
			explodieren();
			return;
		}

		if (step == 46) {
			live = false;
			step = 0;
			return;
		}

		tankManager.maler.drawImage("explode" + (step / 2 + 1) + ".png", x_Koordinate - 2
				* tankManager.koernigkeit2, y_Koordinate - 2 * tankManager.koernigkeit2); // modify the
		// position of
		// Explodes
		if (tankManager.status == GameManager.PAUSE || tankManager.status == GameManager.EXIT) {

		} else {
			step++;
		}
	}
      // inherited constructors



	public ExplodierenEffekt ( TankManager tankManager, int x_Koordinate, int y_Koordinate ) { super(tankManager, x_Koordinate, y_Koordinate); }

}