package se.yrgo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;

    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
    }

    //G
    @Test
    public void testAddABook() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);

        assertEquals(1, bc.getNumberOfBooks());
    }

    //G
    @Test
    public void testFindBook() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);

        try {
            assertEquals(book1, bc.findBook("Learning Java"));
        } catch (BookNotFoundException ex) {
            throw new RuntimeException("Test should not throw exception" + ex);
        }
    }

    //G
    @Test
    public void testFindBookIgnoringCase() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);

        try {
            assertEquals(book1, bc.findBook("LeArNiNg JaVa"));
        } catch (BookNotFoundException ex) {
            throw new RuntimeException("Test should not throw exception" + ex);
        }
    }

    //G
    @Test
    public void testFindBookWithExtraSpaces() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);

        try {
            assertEquals(book1, bc.findBook("  Learning Java  "));
        } catch (BookNotFoundException ex) {
            throw new RuntimeException("Test should not throw exception" + ex);
        }
    }

    //VG
    // This test should throw BookNotFoundException in order to pass.
    @Test
    public void testFindBookThatDoesntExist() throws BookNotFoundException {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);

        assertThrows(BookNotFoundException.class, () ->
        {
            assertEquals(book1, bc.findBook("Harry Potter"));
        });
    }

}
