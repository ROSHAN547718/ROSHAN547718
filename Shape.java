package Day20_Inheritance;
class shape{
    double area(){
        return 0;

    }
}
class rectangle extends shape{
    double length ,breadth;
    rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    @Override
    double area(){
        return length*breadth;

    }
}
class circle extends shape{
    double radius;
    circle(double r){
        radius = r;
    }
    @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
public class Shape{
    public static void main(String[] args) {
        shape s1 = new rectangle(5,6);
        System.out.println("rectangle area: " + s1.area());
        shape s2 = new circle(5);
        System.out.println("circle area: " + s2.area());
    }
}