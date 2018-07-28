class Main {
  public static void main(String[] args) {
    System.out.println("yo");

Test tObj = new Test("Ashley");
System.out.println("Hello, " + tObj.getName());

Test tObj2 = new Test("Ruby");
System.out.println("Hello, " + tObj2.getName());
}

}


class Test {
  private String name;

public Test(String name)
{
  this.name = name;
}

public void setName(String name){
  this.name = name;
}

public String getName(){
  return name;
}

}








