package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println("work is Running on");
        Configuration cfg = new Configuration();
        cfg.configure("image.cgf.xml");
        SessionFactory sessionFactory= cfg.buildSessionFactory();


        Employee em= new Employee();
        em.setName("Aditya");
        em.setCity("Bhopal");
        em.setOpen(true);

        FileInputStream is=new FileInputStream("C:\\Users\\HP\\Documents\\Photo.jpg");
        byte[] img= new byte[is.available()];
        is.read();
        em.setImage(img);

        Session session= sessionFactory.openSession();
        Transaction transaction =session.beginTransaction();
        //session.save(transaction);
        session.save(em);

        transaction.commit();
        session.close();
       // sessionFactory.close();
        System.out.println("Image Uploded");


    }
}
