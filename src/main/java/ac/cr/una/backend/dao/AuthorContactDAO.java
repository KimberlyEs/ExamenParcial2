package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.AuthorContact;
import java.util.List;

/**
 *
 * @author Kimberly
 */
public interface AuthorContactDAO {

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
