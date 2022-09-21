public class Ball extends SolidOfRevolution{
    public Ball(double radius){
        this.radius = radius;
    } // конструторк мяча
    public double getVolume(){
        return 4.0/3*Math.PI*(Math.pow(radius, 3));
    } // объем мяча
}
