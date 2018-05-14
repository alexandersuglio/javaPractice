class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
    int b = 35;
    display(b);
    System.out.println(b);
    
  //  int[] value = {125, 635};
  //  displayArray(value);
    

    Test t = new Test();
    t.length = 300;
    
    displayRef(t);
    
    System.out.println(t.length);
  }
  
  public static void display(int a){
    a += 2;
    System.out.println("inside display method a = " + a);
  }
  
  /*
  public static void displayArray(int[] vals)
  {
    System.out.println("array values " + vals[0]);
  }
  
  */
  
  public static void displayRef(Test v){
    v.length = 888;
  }
 
  
}

class Test{
static int length;

public void setLength(int length){
  this.length = length;
}

public int getLength()
{
  return length;
}
  
}