package cisnux.dev.data;

public class CompanyApp {
    public static void main(String[] args) {
        final var company = new Company();
        company.setName("google");
        final Company.Employee employee = company.new Employee();
        employee.setName("Fajra");
        System.out.println(company.getName());
        System.out.println(employee.getCompany());
        System.out.println(company.getName().equals(employee.getCompany()));
    }
}
