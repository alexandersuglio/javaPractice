class Main {
  public static void main(String[] args) {
 
//can NOT call object of abstract class
// animal test = new animal("Cat", 4);
// System.out.println(test.getName());

dog dogObj = new dog("unnamed", 4, false);
System.out.println(dogObj.tailOrNah());
System.out.println(dogObj.getName());
System.out.println(dogObj.greeting());

pug pugObj = new pug("Ruby", 3, false, "Pug" );
System.out.println(pugObj.greeting());


bird birdObj = new bird("Tweety", 2, true);
System.out.println(birdObj.getName());
System.out.println(birdObj.beakOrNah());
System.out.println(birdObj.greeting());


snake snakeObj = new snake("Sebastian", 0, true);
System.out.println(snakeObj.getName());
System.out.println(snakeObj.forkedTongueOrNah());
System.out.println(snakeObj.greeting());

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

  public String greeting()
  {
    return "Hello! I am an animal named " + getName();
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

    @Override
  public String greeting()
  {
    return "Hola, I am a dog named " + getName();
  }

}


class pug extends dog{
  private String breed;
  private boolean snorts;

public pug(String name, int legs, boolean snorts, String breed){
  super( name,  legs,  snorts);  
 // this.snorts = snorts;
  this.breed = breed;
}

public boolean snortsOrNah(){
  return true;
}

public String getBreed()
{
  return breed;
}

@Override
public String greeting(){
  return "Hey guys! My name is " + getName() + " and I am a " + getBreed(); 
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

    @Override
  public String greeting()
  {
    return "Hola, I am a bird named " + getName();
  }


}


class snake extends animal{
  private boolean forkedTongue;
  public snake(String name, int legs, boolean forkedTongue)
  {
    super(name, legs);
    this.forkedTongue = forkedTongue;
  }

  public boolean forkedTongueOrNah()
  {
    return true;
  }



}






