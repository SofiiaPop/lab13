package ua.edu.ucu.apps.Task3;

public class CompanyInfoFacade {

    public Company getCompanyInfo(String companyName) {
        String chatGPTData = OpenAIExample.getCompanyDescription(companyName);
        String brandfetchData = "Brandfetch data not implemented";
        return new Company(companyName, chatGPTData, brandfetchData);
    }
}
