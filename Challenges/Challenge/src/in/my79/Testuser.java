package in.my79;

public class Testuser {
    public static void main(String[] args) {
        Employee emp = new Employee("Harsh", "19", 5000);

        emp.EmpolyeeDetails();

        System.out.println( emp.EmpolyeeDetails());

        emp.setName("golu");
        System.out.println( emp.EmpolyeeDetails());

    }
}
