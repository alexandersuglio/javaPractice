class Main{

  public static void main(String [] args)

  {

//array initializer
int b[]= {66, 67, 68, 69};

for (int i = 0; i < b.length; i++)
{
System.out.println(b[i]); 
}

//declare array variable
int a[];

//create the array; assign to array variable
a = new int[12];

for (int i = 0; i < a.length; i++){
a[i] = i;
System.out.println(a[i]);
}

 
Main m = new Main();
m.test();
test();

//////

newClass n = new newClass();

n.newMember();

 //newMember();
}

public static void test()
{

System.out.println("test() here!");
}
}

class newClass{

  public static void newMember(){

    System.out.println("newMember() here!");

  }

}