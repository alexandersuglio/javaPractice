class Main {
public static void main(String[] args) {

int a = 13;
int b = 65;

//store first variable inside a temp variable that holds it while you swap the variable values
int temp = a;

a = b;

b = temp;

System.out.print("a = " + a + " b = " + b);

System.out.println("");
System.out.println("");
System.out.println("");


 int grades[] = {45, 60, 78, 22, 90, 11, 23};

  int biggest = grades[0];

    for (int i = 0; i < grades.length; i++)
    {
      if (grades[i] > biggest)
        {
          biggest = grades[i];
        } 
    }
  System.out.println(biggest);



  }
}