import java.util.Scanner;

public class ComplexNumbers {
   int real;
   int img;
   
   int a, b, x, y;
   ComplexNumbers(int r, int i){
	   this.img = i;
	   this.real = r;
}
   public static ComplexNumbers sum(ComplexNumbers c1, ComplexNumbers c2){
	   ComplexNumbers s = new ComplexNumbers(0,0);
	   s.real = c1.real + c2.real;
	   s.img = c1.img + c2.img;
	   return s;
	   //return new ComplexNumbers ((c1.real+c2.real), (c1.img+c2.img));
   }
   
	   
	   public static ComplexNumbers difference(ComplexNumbers c1, ComplexNumbers c2){
		   ComplexNumbers d = new ComplexNumbers(0,0);
		   d.real = c1.real - c2.real;
		   d.img = c1.img - c2.img;
		  return d;
		   // return new ComplexNumbers ((c1.real-c2.real), (c1.img-c2.img));
	   }
		   
	   public static ComplexNumbers product(ComplexNumbers c1, ComplexNumbers c2){
		   ComplexNumbers p = new ComplexNumbers(0,0);
		   p.real = c1.real * c2.real;
		   p.img = c1.img * c2.img;
		   p.real = c1.real*c2.img;
		   p.img = c1.img*c2.real;
		   //return new ComplexNumbers ((c1.real*c2.real) + (c1.real*c2.img) + (c1.img*c2.real) + (c1.img*c2.img));    
		   return p;
		   
}
   public static void main(String[]args) {
	   Scanner z = new Scanner(System.in);
	   System.out.println("Enter the first real part");
	   int a = z.nextInt();
	   System.out.println("Enter the second real part");
      int x = z.nextInt();
	   System.out.println("Enter the first imaginary part");
	   int b = z.nextInt();
	   System.out.println("Enter the second imaginary part");
	   int y = z.nextInt();
	   
	   ComplexNumbers c1 = new ComplexNumbers(a,b);
	   ComplexNumbers c2 = new ComplexNumbers(x,y);
	   ComplexNumbers s = sum(c1,c2);			   
	   ComplexNumbers d = difference(c1,c2);
	   ComplexNumbers p = product(c1,c2);
   System.out.println("Sum = "+ s.real+"+"+s.img +"i");
   System.out.println("Difference = "+ d.real+ "+" + d.img +"i");
   System.out.println("Product = "+ p.real+ "+" + p.img + "i");
   

	   
   }
}