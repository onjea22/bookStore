package Test.UnitTest.Books;


import com.example.Model.Books.Author;
import com.example.Model.Userss.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AuthorTest {

    @Test
    void getFirstName() {
        Author author = new Author("Juna");
        assertEquals("Juna", author.getFirstName());
        assertNotNull(author.getFirstName());
    }

    @Test
    void setFirstName() {
        Author author = new Author("Juna");
        author.setFirstName("Nidia");
        String actual = author.getFirstName();
        assertEquals("Era",actual );
    }

    @Test
    void getLastName() {
        Author author = new Author("Juna", "Dako", Gender.Female);
        assertEquals("Dako", author.getLastName());
        assertNotNull( author.getLastName());
    }

    @Test
    void setLastName() {
        Author author = new Author("Juna", "Dako", Gender.Female);
        author.setLastName("Dako");
        assertEquals("Dako", author.getLastName());
    }

    @Test
    void getGender() {
        Author author = new Author("Juna", "Dako", Gender.Female);
        assertEquals(Gender.Female, author.getGender());
        assertNotNull( author.getGender());
    }

    @Test
    void setGender() {
        Author author = new Author("Juna", "Dako", Gender.Female);
        author.setGender(Gender.Female);
        assertEquals(Gender.Female, author.getGender());
    }


}
