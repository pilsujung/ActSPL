

abstract class ExplodierenEffekt$$TankWar extends GameObject {
	
}

public class ExplodierenEffekt extends  ExplodierenEffekt$$TankWar  {
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

}