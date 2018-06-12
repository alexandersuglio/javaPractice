class Main {
  public static void main(String[] args) {

    square sObj = new square(10, 45);

    System.out.println(sObj.getMessage());

//Square can't access extra member of cube
// System.out.println(sObj.getSubMessage());

 
cube cObj = new cube(66, 77, 88);
System.out.println(cObj.getBase());
System.out.println(cObj.getHeight());
System.out.println(cObj.getWidth());

//cube can access member from superclass
System.out.println(cObj.getMessage());

//cube can access members in its own class
System.out.println(cObj.getSubMessage());

//square can access member in its own class
System.out.println(sObj.getMessage());

//square can NOT access member from subclass
/* System.out.println(sObj.getSubMessage()); */

//subclass can be converted to superclass
//subclass object via a superclass reference 

square sObj2 = cObj;

//the type of the REFERENCED OBJECT not the type of the variable invokes which method is called


//invoking a method on a subclass object via a superclass reference 
System.out.println(sObj2.dogs());


//superclass can NOT be converted to subclass
/* cube cObj2 = sObj;
System.out.println(cObj2.dogs()); */



//System.out.println(sObj2.getSubMessage() + " now works here!");
// //now object of square can access certain variables inside cube
// square sObj2 = cObj;
// System.out.println(sObj2.getSubMessage());


square sObj3 = new cube(1,2,3);
System.out.println(sObj3.dogs());


//Constructor Square can NOT be applied to Cube type
//cube cObj3 = new square(4,5,6);

  }
}

class square{
private int base, height;

public square(int base, int height)
{
  setBase(base);
  setHeight(height);
}

public void setBase(int base)
{
  this.base = base;
}

public void setHeight(int height)
{
  this.height = height;
}

public int getBase()
{
  return base;
}

public int getHeight()
{
  return height;
}

public String getMessage()
{
  return "Hey there!";
}

public String dogs(){
  return "Ruby loves you!";
}

}


class cube extends square{
private int width;

public cube(int base, int height, int width)
{
  super(base, height);
  setWidth(width);
}

public void setWidth(int width)
{
  this.width= width;
}

public int getWidth()
{
  return width;
}

public String getSubMessage(){
  return "This is the subclasses message";
}

@Override
public String dogs(){
  return "No, Tutu loves you";
}

}
