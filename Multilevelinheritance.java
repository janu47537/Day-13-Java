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
class c extends b{
   public void r1(){
    System.out.println("Hello Professors");
   } 
}
public class Multilevelinheritance{
    public static void main(String[]args){
        c f=new c();
        f.p();
        f.r();
        f.r1();
    }
}