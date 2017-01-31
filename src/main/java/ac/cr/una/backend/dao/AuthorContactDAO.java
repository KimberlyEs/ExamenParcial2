
package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.AuthorContact;
import java.util.List;

/**
 *
 * @author Kimberly
 */


public interface AuthorContactDAO {
    boolean deleteAll();
    AuthorContact save(AuthorContact authorContact);
    List<AuthorContact> findAll();
}
