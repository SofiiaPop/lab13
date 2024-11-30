import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Task2.AuthorizationAdapter;
import ua.edu.ucu.apps.Task2.БазаДаних;

import static org.junit.jupiter.api.Assertions.*;

public class AuthorizationAdapterTest {

    @Test
    public void testAuthorize() {
        БазаДаних db = new БазаДаних();
        AuthorizationAdapter authorizationAdapter = new AuthorizationAdapter();
        assertTrue(authorizationAdapter.authorize(db));
    }
}
