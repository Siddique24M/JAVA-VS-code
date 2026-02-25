interface A {
    void m1();  //public and abstract by default
}

//static and default methods are not allowed in interface before java 8
interface B extends A{
    public static void m2(){    //static method in interface
        System.out.println("Static method in Interface");
    }
}
interface C{
    public default void m3(){    //default(Non Static) method in interface
        System.out.println("Default method in interface");
    }
}
class D{
    public void m4(){
        System.out.println("class method");
    }
}
public class Interface1 extends D implements B,C {
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
