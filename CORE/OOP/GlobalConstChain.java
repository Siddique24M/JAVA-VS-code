class InnerGlobalConstChain {
    public InnerGlobalConstChain(int a){
        System.out.println(a);
    }
    
}

public class GlobalConstChain extends InnerGlobalConstChain{
    public GlobalConstChain(){
        super(100);         //should be created explicitly as parent has parametrized constructor
        System.out.println("10");
    }
    public static void main(String[] args) {
        GlobalConstChain g = new GlobalConstChain();
    }
}