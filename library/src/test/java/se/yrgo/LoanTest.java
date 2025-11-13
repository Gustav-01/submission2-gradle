package se.yrgo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LoanTest {

    //VG
    @Test
    public void testDueDate() {
        LocalDate dateNow = LocalDate.now();
        Book book1 = new Book(1, "Harry Potter", "J.K Rowling", "12345", "Fantasy", 500);
        Customer customer1 = new Customer("Gurra", "Gustav", "Olsson", "Göteborg 4B", "0701234567", "email@gmail.com", 5588, GenderType.MALE);

        Loan loan = new Loan(1, customer1, book1);

        assertEquals(dateNow.plusDays(14), loan.getDueDate());
    }
}
