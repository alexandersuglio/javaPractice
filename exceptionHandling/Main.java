import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
  public static void main(String[] args) {
int n, d;

Scanner sObj = new Scanner(System.in);

boolean continueLoop = true;

do {

  try {
System.out.println("enter a numerator");

n = sObj.nextInt();


System.out.println("enter a denominator");

d = sObj.nextInt();


System.out.println(divide(n, d));
continueLoop = false;
  }

  catch(ArithmeticException error){
    System.out.println(error);
  }
}
while (continueLoop);
  }

public static int divide(int num, int denom){
  return num/denom;
}

}