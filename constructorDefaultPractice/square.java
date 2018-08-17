class square {
private int length;
private int width;

public square(){
//  this.length = 0;
//  this.width = 0;
this(10,30);
}   

public square(int length){
  this(length, 55);
}

public square(int length, int width){
  setLength(length);
  setWidth(width);
}

public void setLength(int length)
{
  this.length = length;
}

public int getLength(){
  return length;
}

public void setWidth(int width)
{
  this.width = width;
}

public int getWidth(){
  return width;
}

}