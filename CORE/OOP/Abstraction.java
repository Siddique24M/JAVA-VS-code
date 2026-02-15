abstract class Mobile{
    public abstract void phone();
}
public class Abstraction extends Mobile{
    @Override
    public void phone(){
        System.out.println("open dial-pad");
    }
    public static void main(String[] args) {
        // Mobile m = new Mobile();
        Mobile m = new Abstraction(); 
        m.phone();
    }
}
