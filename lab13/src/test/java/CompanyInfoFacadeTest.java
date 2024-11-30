import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.Task3.Company;
import ua.edu.ucu.apps.Task3.CompanyInfoFacade;

import static org.junit.jupiter.api.Assertions.*;

public class CompanyInfoFacadeTest {

    @Test
    public void testGetCompanyInfo() {
        CompanyInfoFacade facade = new CompanyInfoFacade();
        String companyName = "ucu.edu.ua";
        Company company = facade.getCompanyInfo(companyName);
        
        assertNotNull(company);
        assertEquals("ucu.edu.ua", company.getName());
        assertNotNull(company.getDescription());
        assertNotNull(company.getLogo());
    }
}
