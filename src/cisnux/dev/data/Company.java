package cisnux.dev.data;

public class Company {
    private String name;

    public class Employee {
        String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public String getCompany() {
            return Company.this.getName();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
