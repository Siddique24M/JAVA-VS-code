interface A {
    void m1();
}
interface B extends A{
    public static void m2(){
        System.out.println("Static method in Interface");
    }
}
interface C{
    public default void m3(){
        System.out.println("Default method in interface");
    }
}
class D{
    public void m4(){
        System.out.println("class method");
    }
}
public class Interface1 extends D implements A,B,C {
    @Override
    public void m1() {
        System.out.println("A interface");
        
    }
    
    public static void m2() {
        System.out.println("B interface");
        
    }
   
    public void m3(){
        System.out.println("C interface");
    }
    public static void main(String[] args) {
        Interface1 I = new Interface1();
        I.m1();
        B.m2();
        I.m3();
    }
}
