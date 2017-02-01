package ac.cr.una.backend.dao;

import ac.cr.una.backend.model.AuthorContact;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Kimberly
 */
public class AuthorContactDAOImpl implements AuthorContactDAO {

    private final Session session = HibernateUtil.getSessionFactory().openSession();

    @Override
    public boolean deleteAll() {
        boolean status = false;
        List<AuthorContact> authorCList = new ArrayList<>();
        session.beginTransaction();
        authorCList = session.createCriteria(AuthorContact.class).list();
        for (Object a : authorCList) {
            session.delete(a);
            status = true;
        }
        session.getTransaction().commit();
        return status;
    }

    @Override
    public AuthorContact createAuthorContact(AuthorContact authorContact) {
        session.beginTransaction();
        session.save(authorContact);
        session.getTransaction().commit();

        return authorContact;
    }

    @Override
    public List<AuthorContact> findAll() {
        List<AuthorContact> authorContactList = new ArrayList<>();

        authorContactList = session.createCriteria(AuthorContact.class).list();

        return authorContactList;
    }

}
