
public class Room {
    int roomNo;
    float roomArea;
    boolean acMachine;
    String roomType;
    
    
    void setData(int rno, String rt, float area, boolean ac) {
    	roomNo = rno;
    	roomType = rt;
    	roomArea = area;
    	acMachine = ac;
    }
    void displayData() {
    	System.out.print("The room number is " + roomNo + ". ");
    	System.out.println("It's an " + roomType + " room");
    	System.out.println("The room area is " + roomArea);
    	String x = (acMachine) ? "Yes" : "No";
    	System.out.println("Is there AC Machine in the room? " + x);
    }
	public static void main(String[] args) {
		Room room1 = new Room();
		room1.setData(505, "Executive", (float)320.0, true);
		room1.displayData();
		

	}

}
