package Test.UnitTest.Books;


import com.example.Model.Books.Author;
import com.example.Model.Userss.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AuthorTest {

    @Test
    void getFirstName() {
        Author author = new Author("Sara");
        assertEquals("Sara", author.getFirstName());
        assertNotNull(author.getFirstName());
    }

    @Test
    void setFirstName() {
        Author author = new Author("Sara");
        author.setFirstName("Juna");
        String actual = author.getFirstName();
        assertEquals("Juna",actual );
    }

    @Test
    void getLastName() {
        Author author = new Author("Sara", "Onjea", Gender.Female);
        assertEquals("Onjea", author.getLastName());
        assertNotNull( author.getLastName());
    }

    @Test
    void setLastName() {
        Author author = new Author("Sara", "Onjea", Gender.Female);
        author.setLastName("Onjea");
        assertEquals("Onjea", author.getLastName());
    }

    @Test
    void getGender() {
        Author author = new Author("Greisi", "Jaho", Gender.Female);
        assertEquals(Gender.Female, author.getGender());
        assertNotNull( author.getGender());
    }

    @Test
    void setGender() {
        Author author = new Author("Sara", "Onjea", Gender.Female);
        author.setGender(Gender.Female);
        assertEquals(Gender.Female, author.getGender());
    }


}
