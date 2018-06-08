class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

//can NOT call object of abstract class
// animal test = new animal("Cat", 4);
// System.out.println(test.getName());

dog dogObj = new dog("Ruby", 4, false);
System.out.println(dogObj.tailOrNah());
System.out.println(dogObj.getName());


bird birdObj = new bird("Tweety", 2, true);
System.out.println(birdObj.getName());
System.out.println(birdObj.beakOrNah());

  }
}

abstract class animal
{
  private int legs;
  private String name;

  public animal(String name, int legs)
  {
    this.name = name;
    this.legs = legs;
  }

  public void setLegs(int legs)
  {
    this.legs = legs;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getLegs()
  {
    return legs;
  }

  public String getName()
  {
    return name;
  }

}


class dog extends animal{
  private boolean tail;

  public dog(String name, int legs, boolean tail){
  super(name,legs);
  this.tail = tail;
  }

  public boolean tailOrNah()
  {
    return true;
  }
}

class bird extends animal{
  private boolean beak;
  public bird(String name, int legs, boolean beak)
  {
    super(name, legs);
    this.beak = beak;
  }

  public boolean beakOrNah()
  {
    return true;
  }


}






