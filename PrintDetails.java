package Day22_Polymorphism;

class print{
    String name;
    int age;
    void printdetails(String name){
        System.out.println(name);
    }
    void printdetails(int age){
        System.out.println(age);
    }

}
public class PrintDetails{
    public static void main(String[] args) {
        print p1 = new print();
        p1.printdetails("roshan");
        p1.printdetails(22);
    }
}