class Main {
  public static void main(String[] args) {
square squareObj = new square(34, 67);

//System.out.println(squareObj.getLength());
//System.out.println(squareObj.getWidth());

System.out.println(squareObj.area());

 
cube cubeObj = new cube(66, 67, 68);
System.out.println(cubeObj.volume());

/*
System.out.println(cubeObj.getLength());

System.out.println(cubeObj.getWidth());

System.out.println(cubeObj.getHeight());
*/


  }
}


class square{
  private int length;
  private int width;

  public square(){
    this.length = 20;
    this.width = 20;
  }

  public square(int length, int width)
  {
    //length = length;
   // width = width;

setLength(length);
setWidth(width);

  }

  public void setLength(int length)
  {
    this.length = length;
  }


  public int getLength()
  {
    return length;
  }

  public void setWidth(int width)
  {
    this.width = width;
  }

  public int getWidth()
  {
    return width;
  }

  public int area(){
    return getLength() * getWidth();
  }
}


class cube extends square
{
  private int height;

  public cube()
  {
    getLength();
     getWidth();
   // super(length, width);
    this.height = 0;
  }

  public cube(int length, int width, int height)
  {
     //getLength();
     //getWidth();
    // setLength(0);
    // setWidth(0);
    super(length, width);
    setHeight(height);
  }


  public void setHeight(int height)
  {
    this.height = height;
  }

  public int getHeight()
  {
    return height;
  }


public int volume()
{
  return area() * getHeight();
}

}

