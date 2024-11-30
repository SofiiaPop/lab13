package ua.edu.ucu.apps.Task3;

public class Main {
    public static void main(String[] args) {
        CompanyInfoFacade facade = new CompanyInfoFacade();
        Company company = facade.getCompanyInfo("ucu.edu.ua");
        System.out.println(company);
    }
}
