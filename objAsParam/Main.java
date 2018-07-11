
// class notSure{

// private int a;

// public notSure(int a){
//   this.a = a;

// }

// public boolean isEqual(notSure o)
// {
//   return (o.a == a);
// }

// }

class Test {
  private int x, y;

  public Test(int x, int y){
    this.x = x;
    this.y = y;
  }


public boolean objectCheck(Test test){

if (test.x == x && test.y == y){
  return true;
}
return false;
}

}


class Main {
 

public static void main(String[] args) {
  
int x = 10;

x = addThreeMore(x);

System.out.println(x);

Test t1 = new Test(12, 15);

Test t2 = new Test(12, 14);

Test t3 = new Test (15, 20);

System.out.println("t1 == t2: " + t1.objectCheck(t2));





// notSure nObj = new notSure(20);
// notSure nObj2 = new notSure(20);

// System.out.println(nObj.isEqual(nObj2));

// System.out.println(nObj2.isEqual(nObj));




  }








 





  public static void addThree(int a){
    a += a + 3;
  }

  public static int addThreeMore(int b){
    return b += 3;
  }


}