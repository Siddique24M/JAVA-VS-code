import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(30);
        a.add(40);

        ArrayList<Integer> b = new ArrayList<>();
        a.add(10);
        a.add(20);
        b.addAll(a);
        for( Object o: b){
            System.out.println(o);
        }
    }
}
