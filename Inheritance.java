// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Inheritance {
    public static void main(String[] args) {
        depts d =new depts();
        d.display();
        d.show();
        
    }
}
 class college{
    public int aicteid=720722104;
    public void display()
    {
        System.out.println(aicteid);
    }
}
class depts extends college{
    int dept_code=104;
      void show()
    {
        System.out.println(dept_code);
    }
}