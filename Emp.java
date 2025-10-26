public class Emp {
    private String name;
    private int id;

    // Private constructor prevents direct instantiation
    private Emp(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Emp{id=" + id + ", name='" + name + "'}";
    }

    public static class EmpFactory {
        public static Emp createEmp(String name, int id) {
            return new Emp(name, id); // Only way to create Emp objects
        }
    }
}
