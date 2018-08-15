class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

//instantiating an object of class Main  
Main obj = new Main();

//call static function like it's not static
//but it's not recommended
 System.out.println(obj.addThree(4));

//SHOULD call a static function like it's static
 System.out.println(addThree(20));
  
//can't make a static reference to a non static function!!
/* System.out.println(addFive(10)); */

//SHOULD call a non static function like it's non static
//WITH AN OBJECT!!!!
System.out.println(obj.addFive(100));

  }

  public static int addThree(int a)
  {
    return a + 3;
  }


  public int addFive(int b)
  {
    return b + 5;
  }

}