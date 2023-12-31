
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;



public class Record {
	private ObjectOutputStream out = null;
	private ObjectInputStream in = null;
	private String filename = "record.dat";

	public void writeNote(String name, int note) {
		try {
			in = new ObjectInputStream(new FileInputStream(filename));
		} catch (FileNotFoundException e) {
			try {
				out = new ObjectOutputStream(new FileOutputStream(filename)); 
				out.close();
				in = new ObjectInputStream(new FileInputStream(filename));
			} catch (FileNotFoundException e1) {
			} catch (IOException e1) {
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Note neu = new Note(name, note);
		Vector recorde = new Vector();
		try {
			while (true) {
				recorde.add(in.readObject());
			}
		} catch (EOFException e) {
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			in.close();
			out = new ObjectOutputStream(new FileOutputStream(filename));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Vector temp = new Vector();
		if (recorde.size() > 0) {
			boolean insert = false;
			for (int i = 0; i < recorde.size(); i++) {
				if (note <= ((Note) recorde.elementAt(i)).note) {
					temp.addElement(recorde.elementAt(i));
				} else {
					temp.addElement(neu);
					insert = true;
					for (int j = i; j < recorde.size(); j++) {
						temp.addElement(recorde.elementAt(j));
					}
					break;
				}
			}
			if (!insert) {
				temp.addElement(neu);
			}
		} else {
			temp.addElement(neu);
		}

		for (int i = 0; i < temp.size(); i++) {
			try {
				if (i > 5) {
					break;
				}
				out.writeObject(temp.elementAt(i));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Vector readNote() {
		try {
			in = new ObjectInputStream(new FileInputStream(filename));
		} catch (FileNotFoundException e) {
			try {
				out = new ObjectOutputStream(new FileOutputStream(filename));
				out.close();
				in = new ObjectInputStream(new FileInputStream(filename));
			} catch (FileNotFoundException e1) {
			} catch (IOException e1) {
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Vector recorde = new Vector();
		try {
			while (true) {
				recorde.add(in.readObject());
			}
		} catch (EOFException e) {
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return recorde;
	}
}