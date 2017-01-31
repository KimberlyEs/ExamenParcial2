package ac.cr.una.backend.service;

import ac.cr.una.backend.model.Author;
import ac.cr.una.backend.model.AuthorContact;
import java.util.List;

/**
 *
 * @author Kimberly
 */


public interface AuthorService {
    
    /**
     *
     * @param name
     * @return
     */
    public Author findByName(String name);
     
    /**
     *
     * @return
     */
    boolean deleteAll();

    /**
     *
     * @param authorContact
     * @return
     */
    public AuthorContact createAuthorContact(AuthorContact authorContact);

    /**
     *
     * @return
     */
    public List<AuthorContact> findAll();
}
