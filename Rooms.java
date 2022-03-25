package unit2;

// import java.util.ArrayList;
import java.util.HashMap;

public class Rooms {

	String displayName;
	String descr;
	String N, S, E, W;

//	ArrayList items = new ArrayList();

	Rooms(String displayName, String descr) {
		this.displayName = displayName;
		this.descr = descr;
	}

	void setExit(String N, String S, String E, String W) {
		this.N = N;
		this.E = E;
		this.W = W;
		this.S = S;
	}

	String getExits(char dir) {
		switch (dir) {
		case 'N':
			return this.N;
		case 'S':
			return this.S;
		case 'W':
			return this.W;
		case 'E':
			return this.E;
		default:
			return "";
		}

	}

	static void setupRooms(HashMap<String, Rooms> roomList) {
		
		// 1.
		Rooms r = new Rooms("House",
				"x\n");

		r.setExit("field1", "shop1", "kitchen", "");
		roomList.put("house", r);

		// 2.
		r = new Rooms("Shop", "insert text");

		r.setExit("housepath", "", "", "lab1");
		roomList.put("shop", r);

		// 3.
		r = new Rooms("Secret Lab", "insert text");

		r.setExit("kitchen1", "", "shop1", "");
		roomList.put("lab", r);

		// 4.
		r = new Rooms("Kitchen",
				"x\n");

		r.setExit("", "lab1", "", "housepath");
		roomList.put("kitchen", r);

		// 5.
		r = new Rooms("Grassfield",
				"Behind your house, therx");

		r.setExit("", "housepath", "fpath", "");
		roomList.put("field", r);

		// 6.
		r = new Rooms("Forest", "insert text");

		r.setExit("cabin", "", "field1", "lake1");
		roomList.put("forest", r);
		
		// 7.
		r = new Rooms("Cabin", "insert text");

		r.setExit("", "fpath", "", "");
		roomList.put("Cabin", r);
		
        // 8. 
		r = new Rooms("Lake", "insert text");

		r.setExit("", "", "outpost1", "fpath");
		roomList.put("lake", r); 
		
		 // 9. 
		r = new Rooms("Scientific Outpost", "insert text");

		r.setExit("", "base1", "lake1", "");
		roomList.put("outpost", r);
		
		 // 10. 
		r = new Rooms("Military Base", "insert text");

		r.setExit("outpost1", "", "", "");
		roomList.put("base", r);
		
		

	}

}
