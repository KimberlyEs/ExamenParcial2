/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.BookType;

/**
 *
 * @author Kimberly
 */
public interface BookTypeDAO {
    
    /**
     *
     * @return
     */
    boolean deleteAll();
     
    /**
     *
     * @param type
     * @return
     */
    public BookType findByName(String type);
      
    /**
     *
     * @param bookType
     * @return
     */
    public BookType save(BookType bookType);
}
