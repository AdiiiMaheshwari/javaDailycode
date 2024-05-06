package Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorCode {
    public static void main(String[] args) {
        Vector<String> ve= new Vector<String>();
        ve.add("Aditya");
        ve.add("Ram");
        ve.add("Ajay");
        ve.add("Vijay");

        Iterator<String> itr= ve.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
