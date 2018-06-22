class Main {
  public static void main(String[] args) {
int a = 5;

//System.out.println(addThree(a));

Main aObj = new Main();

System.out.println(aObj.addThree(a));


Main m = new Main();
m.sayHey();


  }

  public int addThree(int a)
  {
return a += 3;
  }

  public void sayHey()
  {
    System.out.println("hey there!");
  }
}