import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorclass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        // System.out.println(list);

        //iteration types
        //type-1 for loop
        for(int i=0; i<list.size(); i++){
            System.out.println("the element is "+ list.get(i));
        }

        //type-2 for each loop - for no indexes
        for(Integer i:list){
            System.out.println("foreach element is "+ i);  //traverse based on the elements not index
        }

        //type-3 Iterator - for collections only
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }
    }
}
// list.add(index, element);
// list.addAll(newList);
// list.get(index);
// list.remove(index);
// list.remove(Integer.valueOf(30)); // same for Character
// list.clear();
// list.set();


