import java.util.*;
class a{
    public void p()
    {
        System.out.println("Hello Students");
    }
}
class b extends a{
    public void r(){
        System.out.println("Hello Teachers");
    }
}
class c extends a{
   public void r1(){
    System.out.println("Hello Professors");
   } 
}
public class Hierarchialinheritance{
    public static void main(String[]args){
        b h=new b();
        h.r();
        h.p();
        c h1=new c();
        h1.p();
        h1.r1();
    }
}