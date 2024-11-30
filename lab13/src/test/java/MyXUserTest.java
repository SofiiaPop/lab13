import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ua.edu.ucu.apps.Task1.myuser.MyXUser;
import ua.edu.ucu.apps.Task1.twitter.XCountry;
import ua.edu.ucu.apps.Task1.twitter.XUser;

import java.time.LocalDate;

public class MyXUserTest {

    @Test
    public void testGetEmail() {
        XUser xUser = new XUser("test@example.com", XCountry.UKRAINE, LocalDate.now());
        MyXUser myXUser = new MyXUser(xUser);
        assertEquals("test@example.com", myXUser.getEmail());
    }

    @Test
    public void testGetCountry() {
        XUser xUser = new XUser("test@example.com", XCountry.UKRAINE, LocalDate.now());
        MyXUser myXUser = new MyXUser(xUser);
        assertEquals(XCountry.UKRAINE.name(), myXUser.getCountry());
    }
}
