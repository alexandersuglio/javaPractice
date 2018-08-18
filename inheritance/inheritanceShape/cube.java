class cube extends square{
  private int height;

  public cube(int l, int w, int h){
    super(l,w);
    height = h;
  }

  public cube(){
    this(0,0,0);
  }

public void setHeight(int h){
  height = h;
}

public int getHeight(){
  return height;
  }

  @Override
public int getArea(){
  return getWidth() * getLength() * getHeight();
}

}