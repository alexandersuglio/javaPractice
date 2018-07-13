import java.util.ArrayList;


class Main {
  public static void main(String[] args) {


String [] season = {"spring", "summer"};

ArrayList<String> exams = new ArrayList<>();

exams.add("calc");

exams.add("history");


//System.out.println(exams.get(0));

for (int i=0; i < exams.size(); i++)
{
  System.out.println(exams.get(i));
}

exams.add(1, "squids");

for (int i=0; i < exams.size(); i++)
{
  System.out.println(exams.get(i));
}


for (int i =0;i < season.length; i++){
  System.out.println(season[i]);
}


  }
}