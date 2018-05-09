import java.util.Scanner;
//java.lang is imported in all java programs 

class Main{
  public static void main(String[] args)
  {
   
   String name;
   
   Scanner nameinput = new Scanner(System.in);
   
//name = nameinput.nextLine();
   
// System.out.println(name); 
 
 double account = 129.4567;
 
 System.out.printf("%.1f ", account);
 
    System.out.println("hey there!");
    
    grades g = new grades("mad 2104");
    
    System.out.println(g.getName());
    
    //System.out.print() is the equivalent of std::cout;

  }
}