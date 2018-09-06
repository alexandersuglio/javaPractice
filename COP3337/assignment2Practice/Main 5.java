class Main {
  public static void main(String[] args) {

int size = 6;
char letters[] = new char[size];


letters[0] = 'a';
letters[1] = 'b';
letters[2] = 'c';
letters[3] = 'x';
letters[4] = 'y';
letters[5] = 'z';


for (char z: letters){
  System.out.print(z + " ");
}

System.out.println("");
System.out.println("");
System.out.println("");

for (int i = 0; i < size/2; i++)
{
    System.out.print(letters[i] + " ");
}

System.out.println("");
System.out.println("");
System.out.println("");

for (int i = size/2; i < size; i++)
{
    System.out.print(letters[i] + " ");
}

System.out.println("");
System.out.println("");
System.out.println("");


int i =0;
int j = size/2;

while (i<size/2)
{
  
  char temp = letters[i];
  letters[i] = letters[j];
  letters[j] = temp;

  i++;
  j++;
}


System.out.println("");
System.out.println("");
System.out.println("");

for (int z =0; z< letters.length; z++){
  System.out.print(letters[z] + " ");
}



  }
}