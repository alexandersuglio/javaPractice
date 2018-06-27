class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  
  
  square sObj = new square(13, 45);

System.out.println(sObj.getHeight());
  

  System.out.println(sObj.getWidth());
  

System.out.println(sObj.greeting());

  }
}

abstract class shape{
  private int height;
  private int width;
  
  public shape(int height, int width){
this.height = height;
this.width = width;
  }

  public void setHeight(int h)
  {
    height = h;
  }

  public void setWidth(int w)
  {
    width = w;
  }

  public int getHeight()
  {
    return height;
  }

  public int getWidth()
  {
    return width;
  }

  public String greeting(){
    return "Hello there!";
  }
}

class square extends shape{

public square(int h, int w){
 super(h, w);
}

@Override
public String greeting()
{
  return "kick rocks!";
}
};