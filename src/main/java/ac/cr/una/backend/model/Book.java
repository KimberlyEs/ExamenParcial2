/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.cr.una.backend.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author Kimberly
 */
@Entity
@Table(name = "book", catalog = "progra3_exa2", uniqueConstraints = {
    @UniqueConstraint(columnNames = "id_book")})
public class Book implements Serializable {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_book", unique = true, nullable = false)
    private int idBook;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_author", nullable = false)
    private Author idAuthor;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type", nullable = false)
    private Author idType;
    
    @Column(name = "name", unique = false, nullable = false)
    private String name;
    
    @Column(name = "daterelease", unique = false, nullable = false)
    private String daterelease;
    
     @Column(name = "price", unique = false, nullable = false)
    private float price;

    /**
     *
     */
    public Book() {
    }

    /**
     *
     * @param idBook
     * @param idAuthor
     * @param idType
     * @param name
     * @param daterelease
     * @param price
     */
    public Book(int idBook, Author idAuthor, Author idType, String name, String daterelease, float price) {
        this.idBook = idBook;
        this.idAuthor = idAuthor;
        this.idType = idType;
        this.name = name;
        this.daterelease = daterelease;
        this.price = price;
    }

    /**
     *
     * @return
     */
    public int getIdBook() {
        return idBook;
    }

    /**
     *
     * @param idBook
     */
    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    /**
     *
     * @return
     */
    public Author getIdAuthor() {
        return idAuthor;
    }

    /**
     *
     * @param idAuthor
     */
    public void setIdAuthor(Author idAuthor) {
        this.idAuthor = idAuthor;
    }

    /**
     *
     * @return
     */
    public Author getIdType() {
        return idType;
    }

    /**
     *
     * @param idType
     */
    public void setIdType(Author idType) {
        this.idType = idType;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getDaterelease() {
        return daterelease;
    }

    /**
     *
     * @param daterelease
     */
    public void setDaterelease(String daterelease) {
        this.daterelease = daterelease;
    }

    /**
     *
     * @return
     */
    public float getPrice() {
        return price;
    }

    /**
     *
     * @param price
     */
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.idBook;
        hash = 37 * hash + Objects.hashCode(this.idAuthor);
        hash = 37 * hash + Objects.hashCode(this.idType);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.daterelease);
        hash = 37 * hash + Float.floatToIntBits(this.price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.idBook != other.idBook) {
            return false;
        }
        if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.daterelease, other.daterelease)) {
            return false;
        }
        if (!Objects.equals(this.idAuthor, other.idAuthor)) {
            return false;
        }
        if (!Objects.equals(this.idType, other.idType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Book{" + "idBook=" + idBook + ", idAuthor=" + idAuthor + ", idType=" + idType + ", name=" + name + ", daterelease=" + daterelease + ", price=" + price + '}';
    }
     
     
    
    
}
