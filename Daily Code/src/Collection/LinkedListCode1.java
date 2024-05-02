package Collection;
import java.util.*;
import java.util.LinkedList;

public class LinkedListCode1 {
    public static void main(String[] args) {

        LinkedList<String> ll= new LinkedList<String>();
        ll.add("Aditya");
        ll.add("Ram");
        ll.add("Ajay");
        ll.add("Vijay");

        Iterator<String> itr= ll.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
