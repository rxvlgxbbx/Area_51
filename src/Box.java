public class Box extends Shape {
    double Vol;

    public Box(double Vol){
        this.Vol = Vol;
    } // конструктор, объявляющий объем коробки

    public boolean add(Shape x){
        this.Vol -= x.getVolume(); // вычитание из объема коробки объем фигуры

        return this.Vol >= 0;
    }

}
