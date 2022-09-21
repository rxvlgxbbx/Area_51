public class Cylinder extends SolidOfRevolution{
    private final double height;

    public Cylinder(double radius, double height){
        this.height = height;
        this.radius = radius;
    } // конструктор циллиндра
    public double getVolume(){
        return Math.PI*(Math.pow(radius, 2))*height;
    } // площадь циллиндра
}
