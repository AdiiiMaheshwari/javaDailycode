package Aggregation;

public class Student {
    int id;
    String name;
    Address address;

    public Student(int id,String name, Address address) {
        this.id=id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state);

    }

    public static void main(String[] args) {
        Address a= new Address("indore","MP","India");
        Address a1=new Address("Raipur","MP","india");

        Student s1=new Student(101,"adi",a);
        Student s2 =new Student(102,"Amana",a1);
        s1.display();
        s2.display();

    }
}
