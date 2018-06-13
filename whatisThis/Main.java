class Main {
  public static void main(String[] args) {
thisTest obj = new thisTest();
obj.idk();
  }
}

class thisTest{
  private int a;

  public thisTest(){
    this(42); //calls the other constructor
  }

  public thisTest(int a){
    this.a = a; //assigns the value of the parameter a to the field of the same name
  }

  public void idk(){
    int a = 1;

  System.out.println(a); //refers to the local variable a
  System.out.println(this.a); //refers to the field a
  System.out.println(this); //refers to the entire object

  }

//you can use t h i s for multiple things"
// clarify that you are talking about a field when there's also something else with the same name as a field
//refer to the current object as a whole
//invoke other constructor of the current class in your constructor



}
