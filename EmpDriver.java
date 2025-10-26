public class EmpDriver {
    public static void main(String[] args) {
        // Create Emp objects through the factory
        Emp e1 = Emp.EmpFactory.createEmp("Rajat", 2005);
        Emp e2 = Emp.EmpFactory.createEmp("Kumar", 2006);

        // Print objects
        System.out.println(e1);
        System.out.println(e2);

        // Direct instantiation NOT allowed
        // Emp e3 = new Emp("Jane", 20051873); // Compile-time error
    }
}
