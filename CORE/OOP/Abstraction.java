//abstract class
abstract class Mobile{
    //abstract method
    public abstract void phone();
}

//concrete class
public class Abstraction extends Mobile{
    @Override
    public void phone(){
        System.out.println("open dial-pad");  //golden java rule
    }

    //concrete method
    public static void main(String[] args) {
        // Mobile m = new Mobile();  --cant create obj of abstract class
        Mobile m1; //but we can create reference variable of abstract class
        m1= new Abstraction();

        Mobile m = new Abstraction(); //upcasting

        //runtime polymorphism
        m.phone();
        m1.phone();
    }
}
