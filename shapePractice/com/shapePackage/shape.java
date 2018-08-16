package com.shapePackage;

abstract class shape {
protected int length;
protected int width;
protected int area;

public shape(int length, int width)
{
    this.length = length;
    this.width = width;
}

public shape(){
    this.length = 20;
    this.width = 100;
}

public void setLength(int length){
    this.length = length;
}

public int getLength(){
    return length;
}

public void setWidth(int width){
    this.width = width;
}

public int getWidth()
{
    return width;
}

public int area(){
    area = getLength() * getWidth();
    return area;
}

}

