package Class18InheritenceAndSuperKeyword;

public class T2Shape {
    double radius;
    public T2Shape(double radius){
        this.radius=radius;
    }
}
class circle extends T2Shape{
    public circle(double radius){
        super(radius);
    }

    void area(){
        double area=radius*radius*Math.PI;
        System.out.println(area);
    }
}

class ShapeTester{
    public static void main(String[] args) {
        circle c=new circle(67.89);
        c.area();
    }
}
