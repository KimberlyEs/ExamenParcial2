/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.BookDAO;
import ac.cr.una.backend.model.Book;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kimberly
 */
public class BookServiceImpl implements BookService {

    private BookDAO bookDao;

    /**
     *
     */
    public BookServiceImpl() {
    }

    /**
     *
     * @param bookDao
     */
    public BookServiceImpl(BookDAO bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public boolean deleteAll() {
        return bookDao.deleteAll();
    }

    @Override
    public Book save(Book book) {
        return bookDao.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    /**
     *
     * @return
     */
    public BookDAO getBookDao() {
        return bookDao;
    }

    /**
     *
     * @param bookDao
     */
    public void setBookDao(BookDAO bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public float totalPriceAll() {
        float total = 0;
        List<Book> list = new ArrayList<>();

        list = bookDao.findAll();
        for (Book b : list) {
            total += b.getPrice();
        }

        return total;

    }

}
