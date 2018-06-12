class Main {
  public static void main(String[] args) {
    employee obj = new employee("dan");

    System.out.println(obj.getName());
    System.out.println(obj.getAge());
    System.out.println(obj.getHeight());
    System.out.println(obj.getWeight());

part_time_employee obj1 = new part_time_employee("Alex", 25, 6, 160, 3);
  
    System.out.println(obj1.getName());
    System.out.println(obj1.getAge());
    System.out.println(obj1.getHeight());
    System.out.println(obj1.getWeight());
    System.out.println(obj1.getYears());
  }
}

class employee{

protected int age, height, weight;
protected String name;

  public employee(){
  this.name = "N/A";
  this.age = 0;
  this.height = 0;
  this.weight = 0;
  }

  public employee(String name, int age, int height, int weight)
{
  setData(name, age, height, weight);
}

public employee(String name)
{
  this(name, 0,0,0);
}

public employee(String name, int age)
{
  this(name, age, 0, 0);
}

public employee(String name, int age, int height)
{
  this(name, age, height, 0);
}


public void setData(String name, int age, int height, int weight){
 this.name = name;
  this.age = age;
  this.height = height;
  this.weight = weight;
}
public String getName()
{
  return name;
}

public int getAge(){
  return age;
}

public int getHeight()
{ 
  return height;
}

public int getWeight(){
  return weight;
}

}

class part_time_employee extends employee
{

private int yearsOnForce;

public part_time_employee(String name, int age, int height, int weight, int yearsOnForce){

super(name, age, height, weight);
setYears(yearsOnForce);

  }



public void setYears(int yearsOnForce){
this.yearsOnForce = yearsOnForce;
}

@Override
public void setData(String name, int age, int height, int weight)
{
  this.name = "Paul";
   this.age = age;
  this.height = height;
  this.weight = weight;
}

public int getYears(){
  return yearsOnForce;
}

}