 class Rectangle {
	int length;
	int breadth;
	
	Rectangle(int l,int b) {
		length = l;
		breadth = b;
	}
	void area() {System.out.println(length*breadth);}

  

	public static void main(String[] args) {
		Rectangle x = new Rectangle(4,5);
		Rectangle y = new Rectangle(5,8);
		
		x.area();
		y.area();
	}	
 }
	

	
