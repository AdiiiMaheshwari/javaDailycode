package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDuplicateCode {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(12);
        set.add(12);
        set.add(13);
        set.add(14);

        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
