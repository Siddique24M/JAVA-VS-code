public class Method_passing {
    int b;
    public static void display(Object m2){        //implicitly upcasting
        System.out.println(m2);
        // System.out.println(m2.b);       class cast exception
        Method_passing m1= (Method_passing)m2;    //explicit downcasting
        System.out.println(m1.b);
    }
    public static void main(String[] args) {
        Method_passing m = new Method_passing();     //creating object of class
        m.b=10;     //assigning value to variable b
        System.out.println(m);
        System.out.println(m.b);
        display(m);
    }
    
}
