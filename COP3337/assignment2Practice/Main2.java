class Main {
  public static void main(String[] args) {

//how many values you are going to store in your array
//defaults to false
boolean taken[] = new boolean[10]; 

String occupancy = "_";
  
  int min = taken.length - taken.length;
  int max = taken.length;
  int mid = (max + min) / 2;
  taken[mid] = true;
  //taken[2] = true;


for (int i = 0; i < taken.length; i++)
{
 
if (taken[i] == false)
{
 System.out.print(occupancy + " ");
}
 else  
 {
   occupancy = "x";
   System.out.print(occupancy + " ");
 }

  occupancy = "_";
  
/*
 if (taken[mid] == true)
 {
   min = taken.length - taken.length;
   max = mid;
   mid = (max + min)/2;
  
  occupancy = "x";
  System.out.print(occupancy + " ");

 }
*/
}




  }
}