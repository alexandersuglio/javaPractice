import com.shapePackage.*;

public class main {
    public static void main(String args[])
    {
square sObj = new square(4,5);
System.out.println(sObj.area());



        square sObj2 = new square();
        System.out.println(sObj2.area());

        sObj2.setLength(13);
        System.out.println(sObj2.area());

        


    }
}


