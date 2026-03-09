package StringBuilder;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //append
        sb.append("hello");
        // System.out.println(sb);

        //insert at position adding new string
        sb.insert(1, "ye");
        System.out.println(sb);

        //replace from Start position and end-1 with given String
        sb.replace(1, 3, "s");
        System.out.println(sb);//removed ye and added s instead

        //delete
        sb.delete(1, 2);
        System.out.println(sb);  
        System.out.println(sb.capacity());
        
    }
}
