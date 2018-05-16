import java.util.Scanner;

class Main {
  public static void main(String[] args) {

 

 

int i = 0;

do{
int numberinput;
System.out.println("enter number below!");
Scanner input = new Scanner(System.in);

numberinput = input.nextInt();
try 
{
  System.out.println(10/numberinput);
 
}

catch(Exception e)
{
  System.out.println("ERROR");
}
i++;
}

while (i < 10);
 
  }
}