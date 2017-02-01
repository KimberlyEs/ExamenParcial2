/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Book;
import ac.cr.una.backend.model.BookType;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Kimberly
 */
public class BookDAOImpl implements BookDAO{
    
    private final Session session = HibernateUtil.getSessionFactory().openSession();
    
    @Override
    public boolean deleteAll() {
        boolean status = false;
        List<Book> list = new ArrayList<>();
        session.beginTransaction();
        list = session.createCriteria(Book.class).list();
        for(Object book : list){
            session.delete(book);
            status = true;
        }
        session.getTransaction().commit();
        return status;
    }

    @Override
    public Book save(Book book) {
         session.beginTransaction();
        session.save(book);
        session.getTransaction().commit();

        return book;
    }

    @Override
    public List<Book> findAll() {
        List<Book> bList = new ArrayList<>();

        bList = session.createCriteria(Book.class).list();

        return bList;
        
       
    }

}
