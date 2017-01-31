package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.Author;

/**
 *
 * @author Kimberly
 */


public interface AuthorDAO {
     public Author findByName(String name);
}
