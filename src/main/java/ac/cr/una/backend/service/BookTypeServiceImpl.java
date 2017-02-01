/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.service;

import ac.cr.una.backend.dao.BookTypeDAO;
import ac.cr.una.backend.model.BookType;

/**
 *
 * @author Kimberly
 */
public class BookTypeServiceImpl implements BookTypeService{

    private BookTypeDAO authorDAO;

    public BookTypeServiceImpl() {
    }

    public BookTypeServiceImpl(BookTypeDAO authorDAO) {
        this.authorDAO = authorDAO;
    }

    public BookTypeDAO getAuthorDAO() {
        return authorDAO;
    }

    public void setAuthorDAO(BookTypeDAO authorDAO) {
        this.authorDAO = authorDAO;
    }
  
    
    @Override
    public boolean deleteAll() {
       return authorDAO.deleteAll();
    }

    @Override
    public BookType findByName(String name) {
        return authorDAO.findByName(name);
    }

    @Override
    public BookType save(BookType bookType) {
        return authorDAO.save(bookType);
    }
    
}
