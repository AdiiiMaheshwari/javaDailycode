package Java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Pro{
     int ProductId;
     String ProductName;
     int ProductPrice;
     int ProductQuantity;

     public Pro(int ProductId, String ProductName, int ProductPrice,int ProductQuntity){
         this.ProductId=ProductId;
         this.ProductName=ProductName;
         this.ProductPrice=ProductPrice;
         this.ProductQuantity=ProductQuntity;
     }
}

public class productStreamDemo {
    public static void main(String[] args) {

        List<Pro> ProductList= new ArrayList<Pro>();
        ProductList.add(new Pro(1,"Cream",65,3));
        ProductList.add(new Pro(3,"Powder",88,2));
        ProductList.add(new Pro(12,"Lotion",200,1));
        ProductList.add(new Pro(9,"Bag",599,3));
        ProductList.add(new Pro(14,"Kit",299,4));
        ProductList.add(new Pro(5,"Bucket",99,6));

        List<Integer> statelist= ProductList.stream()
                .filter(p -> p.ProductId > 3)//Filering
                .map(m -> m.ProductId).//fetching
                        collect(Collectors.toList());
        System.out.println(statelist);
    }
}
