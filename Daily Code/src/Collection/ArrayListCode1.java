package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCode1 {
    public static void main(String[] args) {

        ArrayList<String>l= new ArrayList<String>();
        l.add("Apple");
        l.add("Mango");
        l.add("Banana");
        l.add("Grapes");
        l.add("Orange");

        Iterator<String> itr= l.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
