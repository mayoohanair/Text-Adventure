package unit2;
import java.util.HashMap;


public class Items {

		 String name;
		 String description;
		 boolean isCarryable; 
		 boolean isActivated; 
		 String readText = ""; 
		 
		 //constructors
		 
		 Items(String name, String description) { 
			 this.name = name; 
			 this.description = description; 
		
			 
		 } 
		 
		 //getters
		 
		 //create items
		 static void setupItems(HashMap<String, Items> itemList,
			HashMap<String, Items> roomList) {
			
			 Items zz = new Items("Phone", "");
			 zz.readText = "100% charged";
			 itemList.put("phone", zz);
			 roomList.get("House").Items.add("phone");
			 
			 zz = new Items("Green Apple", ""); 
			 itemList.put("apple", zz); 
			 roomList.get("Kitchen").Items.add("apple");
			 
			 zz = new Items("Shovel", "Weapon"); 
			 itemList.put("shovel", zz); 
			 roomList.get("House").Items.add("shovel");
			 
			 zz = new Items("Edible beetles", "Good nutritents"); 
			 itemList.put("beetles", zz); 
			 roomList.get("Grassfield").Items.add("beetles"); 
			 
			 zz = new Items("Chloramine gas", "Fatal gas. Do not inhale. "); 
			 itemList.put("cholramine gas", zz); 
			roomList.get("Secret Lab").Items.add("chloramine gas");
			 
			 zz = new Items("Vaccine needles", ""); 
			 itemList.put("vaccine needles", zz); 
			 roomList.get("Secret Lab").Items.add("vaccine needles");
			 
			 zz = new Items("Wood", ""); 
			 itemList.put("wood", zz); 
			 roomList.get("Forest").Items.add("wood");
			 
			 zz = new Items("Missing ID", "Looks like an ID from the CDC.."); 
			 itemList.put("id", zz); 
			 roomList.get("Forest").Items.add("id");
			 
			 
			 zz = new Items("Leather Armor", ""); 
			 itemList.put("armor", zz); 
			 roomList.get("Cabin").Items.add("armor");
			 
			 zz = new Items("Nunchucks", ""); 
			 itemList.put("nunchucks", zz); 
			 roomList.get("Cabin").Items.add("nunchucks");
			 
			 zz = new Items("Rotten quiche", ""); 
			 itemList.put("quiche", zz); 
			 roomList.get("Cabin").Items.add("quiche");
			 
			 
			 zz = new Items("Carp", ""); 
			 itemList.put("carp", zz); 
			 roomList.get("Lake").Items.add("carp");
			 
			 
			 zz = new Items("Katana", "A katana.. from the lake."); 
			 itemList.put("katana", zz); 
			 roomList.get("Lake").Items.add("Katana");
			 
			 zz = new Items("AK-47", ""); 
			 itemList.put("ak-47", zz); 
			 roomList.get("Military base").Items.add("ak-47");
			 
			 
			 
			 
			 
		 
	}
	

}