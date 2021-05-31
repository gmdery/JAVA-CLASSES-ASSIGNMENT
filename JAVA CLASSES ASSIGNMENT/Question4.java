import java.util.Scanner;

public class Area {
	
		int length;
		int breadth;
		
		Area(int l,int b) {
			length = l;
			breadth = b;
		}
	void returnArea() {System.out.println("Area = " + length*breadth);}

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int l = a.nextInt();
		System.out.println("Enter the breadth: ");
		int b = a.nextInt();
		
		Area x = new Area(l,b);
		
			
		x.returnArea();
		
		}	
	 }

