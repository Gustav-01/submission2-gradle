package se.yrgo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

    //G
    @Test
    public void test2EqualBooks() {
        Book book1 = new Book(1, "Book", "", "", "", 0);
        Book book2 = new Book(1, "Book", "", "", "", 0);

        assertEquals(book1, book2);
    }

    //G
    @Test
    public void test2NonEqualBooks() {
        Book book1 = new Book(1, "Book", "", "", "", 0);
        Book book2 = new Book(2, "Book", "", "", "", 0);

        assertNotEquals(book1, book2);
    }

}
