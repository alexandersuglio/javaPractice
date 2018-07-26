import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
Test tobj = new Test(33);

System.out.println(tobj.getClass());

//create objects of all the wrapper classes

//autoboxing 
Integer a = 5;

System.out.println(a.getClass());

//constructor
Integer a2 = new Integer(23);

System.out.println(a2.doubleValue());

//System.out.println(a2.getClass());

//static method value
//value of method return an object of the cooresponding wrapper class web it's passed as an argument of a primative type or string 
Integer a3 = Integer.valueOf(200);
Integer a4 = Integer.valueOf(200);


System.out.println(a3 == a4);


  }
}


class Test {
  private int a;

  public Test(int a)
  {
    this.a = a;
  }

  public void setTest(int a)
  {
    this.a = a;
  }

  public int getTest(){
    return a;
  }
}