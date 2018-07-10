class Main {
  public static void main(String[] args) {
Person person1 = new Person("John", 21);

Person person2;

person2 = person1;

person2.changeDetails("Mary", 30);

System.out.println(person2);
  }


}

class Person{
 private String name;
 private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String toString(){
    return "name: " + name + ", name: " + age;
  }

  public void changeDetails(String name, int age){
    this.name = name;
    this.age = age;
  }
}

