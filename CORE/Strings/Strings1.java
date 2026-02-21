import java.util.*;
public class Strings1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);


        //charAt(index)
        System.out.println(sb.charAt(2));

        //setCharAt(index, char)
        sb.setCharAt(0, 'p');  //pony

        //insert(index, char)
        sb.insert(2, 'n');
        System.out.println(sb); //ponny

        //delete(s index, e index)
        sb.delete(2, 4); //poy
        
        //append("str")
        sb.append(" Stark"); //Append add at the end 
        
        //
    }
}
