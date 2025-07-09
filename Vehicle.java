package Day20_Inheritance;
class vehicle{
    void start(){
        System.out.println("Vehicle started");
    }
}
class car extends vehicle{
    @Override
    void start(){
        System.out.println("Car is Started");
    }
}
class bike extends vehicle{
    @Override
    void start(){
        System.out.println("bike is Started");
    }
}
public class Vehicle{
    public static void main(String[] args) {
        vehicle v1 = new car();
        v1.start();
        vehicle v2 = new bike();
        v2.start();
    }
}