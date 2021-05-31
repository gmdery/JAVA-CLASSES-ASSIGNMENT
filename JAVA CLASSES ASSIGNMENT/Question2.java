
class Triangle{
	int l = 4;
	int h = 5;
	int b = 3;
		
public static void main(String args[]) {
	Triangle a = new Triangle();
	System.out.println("Area = " + (a.l)*(a.b)*0.5 + "units sq");
	System.out.println("Perimeter = " + ((a.l) + (a.b) + (a.h)) + "units");
}
}
