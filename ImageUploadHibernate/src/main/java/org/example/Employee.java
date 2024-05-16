package org.example;

import javax.persistence.*;

@Entity
@Table(name="Employee_Table")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Employee_Id")
    private int id;
    private String Name;
    private String City;
    private  boolean isOpen;
    @Transient
    private  double x;
    @Lob
    private  byte[] image;
    public Employee(){
        super();

    }
    public Employee(int id, String Name, String City, boolean isOpen, double x, byte[] image){
        super();
        this.id=id;
        Name= Name;
        this.City=City;
        this.isOpen=isOpen;
        this.x=x;
        this.image=image;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
