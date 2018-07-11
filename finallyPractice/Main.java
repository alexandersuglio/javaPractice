import java.lang.ArrayIndexOutOfBoundsException;


class Main {
  public static void main(String[] args) {
Main mobj = new Main();
System.out.println(mobj.getInt());
  }

int getInt(){
  int returnVal = 10;
  try{
    String [] students = {"harry", "alex"};
    System.out.println(students[5]);
  }
  catch(RuntimeException e) {
System.out.println(returnVal);
return returnVal;
  }
  finally {
    returnVal = returnVal +=13;
    
    System.out.println(returnVal);
  }
  return returnVal;
}






}