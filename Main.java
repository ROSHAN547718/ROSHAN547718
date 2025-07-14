package Day23_Refactor;
class Student {
    private String name;
    private int age;
    private String rollNumber;

    // Constructor
    public Student(String name, int age, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
public class Main {
    public static void main(String[] args) {
        // Test Student class
        Student student = new Student("Roshan", 20, "CS101");
        System.out.println("Student Name: " + student.getName());
        student.setAge(21);
        System.out.println("Updated Age: " + student.getAge());

        // // Test BankAccount class
        // BankAccount account = new BankAccount("ACC12345");
        // account.deposit(1000);
        // System.out.println("\nAccount Number: " + account.getAccountNumber());
        // System.out.println("Balance after deposit: ₹" + account.getBalance());

        // boolean success = account.withdraw(500);
        // System.out.println("Withdraw 500: " + (success ? "Success" : "Failed"));
        // System.out.println("Remaining Balance: ₹" + account.getBalance());

        // // Test Product class
        // Product product = new Product("Laptop", 50000);
        // System.out.println("\nProduct Name: " + product.getName());
        // System.out.println("Original Price: ₹" + product.getPrice());
        // System.out.println("Price after 10% discount: ₹" + product.getDiscountedPrice(10));
    }
}

