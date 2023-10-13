package org.example;

import org.example.entities.User;
import org.example.utils.HibernateUtil;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello World");

        SessionFactory sf = HibernateUtil.getSesseionFactory();
        try(Session session = sf.openSession()) {
            Transaction tx = session.beginTransaction();
            User user = new User();
            user.setEmail("vitalikmarchuk2508@gmail.com");
            user.setFirstName("Vitalii");
            user.setLastName("Marchuk");
            user.setPhone("+48506594885");
            user.setPassword("123456");
            session.save(user);

            tx.commit();

            System.out.println("User save id = " + user.getId());
        }

    }
}