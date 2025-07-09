package Day20_Inheritance;
class person{
    void displayrole(){
        System.out.println("Gneric person");
    }
}
class student extends person{
    @Override
    void displayrole(){
        System.out.println("Student");
    }
}
class teacher extends person{
    @Override
    void displayrole(){
        System.out.println("Teacher");
    }
}
public class Person{
    public static void main(String[] args) {
        person p1 = new student();
        p1.displayrole();
        person p2 = new teacher();
        p2.displayrole();
    }
}