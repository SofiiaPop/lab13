import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Task2.БазаДаних;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseTest {

    @Test
    public void testGetUserData() {
        БазаДаних db = new БазаДаних();
        assertEquals("hello", db.отриматиДаніКористувача());
    }

    @Test
    public void testGetStatisticalData() {
        БазаДаних db = new БазаДаних();
        assertEquals("hello2", db.отриматиСтатистичніДані());
    }
}
