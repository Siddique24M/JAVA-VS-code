public class Method_passing {
    int b;
    public static void display(Object m2){  
        System.out.println(m2);
        // System.out.println(m2.b);
        Method_passing m1= (Method_passing)m2;
        System.out.println(m1.b);
    }
    public static void main(String[] args) {
        Method_passing m = new Method_passing();
        System.out.println(m);
        System.out.println(m.b);
        display(m);
    }
    
}
