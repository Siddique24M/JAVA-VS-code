interface A {
    void m1();
}
interface B extends A{
    void m2();
}
class C{
    public void m3(){
        System.out.println("class method");
    }
}
public class Interface1 extends C implements A,B {
    @Override
    public void m1() {
        System.out.println("A interface");
        
    }
    @Override
    public void m2() {
        System.out.println("B interface");
        
    }
    public static void main(String[] args) {
        Interface1 I = new Interface1();
        I.m1();
        I.m2();
    }
}
