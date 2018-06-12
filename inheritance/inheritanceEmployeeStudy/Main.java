class Main {
  public static void main(String[] args) {

salariedEmply emp1 = new salariedEmply("Alex", 40, 26.50);

System.out.println(emp1.YTD());

salariedEmplyWbonus emp2 = new salariedEmplyWbonus("Chris", 40, 26.5, 500);

System.out.println(emp2.YTD());

employee[] test = new employee[2];

test[0] = emp1;
test[1] = emp2;

for (employee current : test)
{
  System.out.println(current.getName());

 
if (current instanceof salariedEmplyWbonus){
 salariedEmplyWbonus emp3 = (salariedEmplyWbonus)current;
 System.out.println(emp3.notice());

}
}

//System.out.println(emp2.getClass().getName());


  }
}

abstract class employee{
  private String name;
  private int hours;
  private double wage;

  public employee(String name, int hours, double wage)
  {
    this.name = name;
    this.hours = hours;
    this.wage = wage;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public void setHours(int hours)
  {
    this.hours = hours;
  }

  public int getHours()
  {
    return hours;
  }

  public void setWage(double wage){
    this.wage = wage;
  }

  public double getWage()
  {
    return wage;
  }

  public double YTD()
  {
    return getHours() * getWage();
  }
} 

class salariedEmply extends employee
{
public salariedEmply(String name, int hours, double wage){
  super(name, hours, wage);
}
}

class salariedEmplyWbonus extends salariedEmply
{
  private int bonus;
  public salariedEmplyWbonus(String name, int hours, double wage, int bonus){
    super(name, hours, wage);
    this.bonus = bonus;
  }

  public void setBonus(int bonus){
    this.bonus = bonus;
  }

  public int getBonus()
  {
    return bonus;
  }

  @Override
  public double YTD(){
    return super.YTD() + getBonus();
  }

  public String notice(){
    return "I get a bonus!";
  }

}




// 1. Assigning a superclass reference to a superclass variable is straightforward.

// 2. Assigning a subclass reference to a subclass variable is straightforward.

// 3. Assigning a subclass reference to a superclass variable is safe, because the subclass
// object is an object of its superclass. However, the superclass variable can be used
// to refer only to superclass members. If this code refers to subclass-only members
// through the superclass variable, the compiler reports errors.

// 4. Attempting to assign a superclass reference to a subclass variable is a compilation
// error. To avoid this error, the superclass reference must be cast to a subclass type
// explicitly. At execution time, if the object to which the reference refers is not a subclass
// object, an exception will occur. (For more on exception handling, see
// Chapter 11.) You should use the instanceof operator to ensure that such a cast
// is performed only if the object is a subclass object.