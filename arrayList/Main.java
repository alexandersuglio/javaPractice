import java.util.ArrayList;
import java.lang.reflect.Field;

class Main {
  public static void main(String[] args) {
  
ArrayList <Integer> age = new ArrayList<>();

age.add(73);
age.add(13);
age.add(53);
age.add(43);

for (int i =0; i < age.size(); i++){
  System.out.println(age.get(i));
}
  
//ArrayList<String> exams = new ArrayList<>();

System.out.println();

String [] names = {"Alex", "Mike", "Ray", "Greg"};

for (int j = 0; j < names.length; j++)
{
  System.out.println(names[j]);
}

Object obj = new Integer(100);

System.out.println(obj);

System.out.println(obj.getClass());

int z = 88;

// string alexName = "Alex";

  }
}