package org.example;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private int eid;
    private String empName;
    private String design;
    private Bank bank;

    public Employee(){
        super();
    }
    public Employee(int eid, String empName, String design, Bank bank) {
        super();
        this.eid = eid;
        this.empName = empName;
        this.design = design;
        this.bank = bank;
    }

    public int getEmpid() {
        return eid;
    }
    public void setEmpid(int empid) {
        this.eid = empid;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getDesgn() {
        return design;
    }
    public void setDesgn(String desgn) {
        this.design = desgn;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }


}
