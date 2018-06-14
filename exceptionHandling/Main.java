import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");


System.out.println("what's your age?");

int name;
boolean continueLoop = true;


Scanner sObj = new Scanner(System.in);
 name = sObj.nextInt();

do {
try {
System.out.println(name);
continueLoop = false;
}

catch(InputMismatchException error){
System.out.println(error);
}

}

while (continueLoop);
  
  }
}