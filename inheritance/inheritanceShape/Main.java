import java.util.Scanner;

class Main {
  public static void main(String[] args) {
System.out.println("enter THREE values for cube");

Scanner lObj = new Scanner(System.in);

int l = lObj.nextInt();

Scanner wObj = new Scanner(System.in);

int w = wObj.nextInt();

Scanner hObj = new Scanner(System.in);

int h = hObj.nextInt();


/*
square sObj = new square(2,10);
System.out.println(sObj.getArea());
*/


cube cObj = new cube(l, w, h);
System.out.println("Cube length " + cObj.getLength());
System.out.println("Cube width " + cObj.getWidth());
System.out.println("Cube height " + cObj.getHeight());
System.out.println("Cube area " + cObj.getArea());

  }
}

 