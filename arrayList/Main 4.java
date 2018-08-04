import java.util.ArrayList;


class Main {
  public static void main(String[] args) {
   
   String [] names = {"alex", "Steve", "tim", "Ruby"};

for (int i = 0; i < names.length; i++)
{
  System.out.println(names[i]);
}

ArrayList <Integer> idk = new ArrayList<Integer>();

idk.add(23);
idk.add(13);
idk.add(43);

//modified for loop
for (int x: idk)
{
  System.out.println(x);
}



  }
}