public class StaticNonStatic {
    static{
        System.out.println("Static-Block");      //1
    }
    {
        System.out.println("Non-staic-block");   //3
    }
    public StaticNonStatic(){
        System.out.println("Constructor");       //4
    }
    public static void main(String[] args) {
        System.out.println("main started");      //2
        new StaticNonStatic();
        System.out.println("main ended");        //5
    }
}
