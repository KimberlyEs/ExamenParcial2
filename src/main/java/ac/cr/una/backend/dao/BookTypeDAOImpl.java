/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.BookType;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Kimberly
 */
public class BookTypeDAOImpl implements BookTypeDAO{

     private final Session session = HibernateUtil.getSessionFactory().openSession();
     
    @Override
    public boolean deleteAll() {
        boolean status = false;
        List<BookType> bookList = new ArrayList<>();
        session.beginTransaction();
        bookList = session.createCriteria(BookType.class).list();
        for(Object a : bookList){
            session.delete(a);
            status = true;
        }
        session.getTransaction().commit();
        return status;
    }

    @Override
    public BookType findByName(String type) {
       BookType bookType = null;
        
        Query query = session.createQuery("from BookType where type = :type");
        query.setParameter("type", type);

        if (query.list().size() > 0) {
            bookType = (BookType) query.list().get(0);
        }

        return bookType;
    }

    @Override
    public BookType save(BookType bookType) {
        session.beginTransaction();
        session.save(bookType);
        session.getTransaction().commit();

        return bookType;
    }
    
}
