package ReadMe.domain;

import java.util.Date;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author madjanne
 */
public class BookTest {
    private Book book;
    
    public BookTest() {
    }
    
    @Before
    public void setUp() {
        this.book = new Book(1, "author", "title", "a52d253", "desc", 2018, false, new Date(5));            
    }
    
    @Test
    public void toStringTest() {
        assertEquals("book_id: " + 1 + ", book_author: " + "author" + ", book_title: " + "title" + 
                ", ISBN: " + "a52d253" + ", book_description: " + "desc" + ", book_year: " + 2018 +
                ", book_checked: " + false + ", book_date_checked: " + new Date(5), book.toString());
    }
    
    @Test
    public void equalsTrueTest() {
        Book comp = new Book(1, "author", "title", "a52d253", "desc", 2018, false, new Date(5));
        assertTrue(book.equals(comp));
    }
    @Test
    public void equalsFalseTest() {
        Book not = new Book(3, "author1", "title2", "www4", "descr", 2015, true, new Date());
        assertFalse(book.equals(not));
    }
}
