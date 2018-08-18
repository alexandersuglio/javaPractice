
abstract class shape {
protected int length;
protected int width;

public shape(){
//ALSO WORKS
//  this.length = 0;
//  this.width = 0;
this(0,0);
}   

public shape(int length){
//ALSO WORKS
//this.length = length;
//this.width = 0;
this(length, 0);
}

public shape(int length, int width){
 //ALSO WORKS
 // setLength(length);
 // setWidth(width);
 this.length = length;
 this.width = width;
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

public int getArea(){
  return getWidth() * getLength();
}

}