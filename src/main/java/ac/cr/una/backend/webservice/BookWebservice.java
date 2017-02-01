/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.webservice;

import ac.cr.una.backend.dao.BookDAO;
import ac.cr.una.backend.dao.BookDAOImpl;
import ac.cr.una.backend.model.Book;
import ac.cr.una.backend.service.BookService;
import ac.cr.una.backend.service.BookServiceImpl;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author Kimberly
 */
@Path("books")
public class BookWebservice {
    private BookDAO dao;
    private BookService service;
    
    @Context
    private UriInfo context;
    
    @DELETE
    @Path("/")
    public boolean deleteBook() {
        boolean result;
        dao = new BookDAOImpl();
        service = new BookServiceImpl(dao);
        result = service.deleteAll();

        return result;
    }
    
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Book save(Book b) {

        dao = new BookDAOImpl();
        service = new BookServiceImpl(dao);

        b = service.save(b);

        return b;
    }
    
    @GET
    @Path("/totalprice")
    @Produces(MediaType.APPLICATION_JSON)
    public float getTotalPrice() {
        float result=0;
        dao = new BookDAOImpl();
        service = new BookServiceImpl(dao);

        result = service.totalPriceAll();

        return result;
    }
    
    
}
