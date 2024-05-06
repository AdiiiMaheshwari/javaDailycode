package Collection;

import java.util.Iterator;
import java.util.Stack;

public class StackCode {
    public static void main(String[] args) {
        Stack<String> s= new Stack<>();
        s.push("Aditya");
        s.push("Ram");
        s.push("Ajay");
        s.push("Vijay");
        s.pop();
        Iterator<String> itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
