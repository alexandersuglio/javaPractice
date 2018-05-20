import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {

System.out.println("Enter your name below");

        String name;


Scanner nameInput = new Scanner(System.in);

name = nameInput.nextLine();


System.out.println("Hello, " + name + " please enter your age");

int age;

Scanner ageInput = new Scanner(System.in);

age = ageInput.nextInt();

if (age < 21){
    System.out.println("Sorry, " + "you're too young.");
}
else {
    System.out.println("Welcome!");
}




        int a[] = new int[5];

     for (int num: a){
         System.out.println(num);
     }

     int b[] = {22,33,44,55,66};

     for (int a=0; a< b.length; a++){
         System.out.println(b[a]);
     }


        int c[][] = {{1,2,3}, {4}, {7,8,9}, {10,11,12}};

//loops through all rows
for (int a = 0; a < c.length; a++ )
{
    //loops through all columns
for (int z=0; z< c[a].length; z++)
{
    //change specific value in the row 1 array
    for (int x=0; x< c[1].length; x++)
    {
        c[1][x] = 66;
    }

    //prints the multidimensional array
    System.out.printf("%d ", c[a][z]);

}
}
        System.out.println();

    }



}
