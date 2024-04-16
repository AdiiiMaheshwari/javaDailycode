package Interface;

interface Bank {
    int rateOfIntrest();
}

class Sbi implements Bank {
    public int rateOfIntrest() {
        return 9;
    }
}

class Pnb implements Bank {
    public int rateOfIntrest() {
        return 11;
    }
}


public class InterfaceCode {
    public static void main(String[] args) {
        Bank b = new Sbi();
        Bank a = new Pnb();
        System.out.println("Sbi rate of Intrest is : " + b.rateOfIntrest());
        System.out.println("PNB rate of Intrest is : " + a.rateOfIntrest());
    }
}
