public class Vector {
    int x;
    int y;
    int z;

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    } // метод, возвращающий объект строкой
    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    } // конструктор класса Vector

    public double lengthVector(Vector vector){
        return Math.sqrt(vector.x*vector.x + vector.y*vector.y + vector.z*vector.z);
    } // метод, вычисляющий длину вектора

    public double scalarVectors(Vector vector1, Vector vector2){
        return vector1.x*vector2.x + vector1.y*vector2.y + vector1.z*vector2.z;
    } // метод, вычисляющий скалярное произведение векторов

    public Vector multiVector(Vector vector1, Vector vector2){
        Vector result = new Vector(0, 0, 0);

        result.x = vector1.y*vector2.z - vector1.z*vector2.y;
        result.y = vector1.z*vector2.x - vector1.x*vector2.z;
        result.z = vector1.x*vector2.y - vector1.y*vector2.x;

        return result;
    } // метод, вычислящий векторное произведение

    public double angleVector(Vector vector1, Vector vector2) {
        double scalar;
        double len1;
        double len2;

        scalar = vector1.x*vector2.x + vector1.y*vector2.y + vector1.z*vector2.z;
        len1 = Math.sqrt(vector1.x*vector1.x + vector1.y*vector1.y + vector1.z*vector1.z);
        len2 = Math.sqrt(vector2.x*vector2.x + vector2.y*vector2.y + vector2.z*vector2.z);

        return scalar/(len1*len2);
    } // метод, вычисляющий угол между векторами

    public Vector sumVector(Vector vector1, Vector vector2){
        Vector result = new Vector(0,0,0);

        result.x = vector1.x + vector2.x;
        result.y = vector1.y + vector2.y;
        result.z = vector1.z + vector2.z;

        return result;
    } // сумма векторов

    public Vector diffVector(Vector vector1, Vector vector2){
        Vector result = new Vector(0,0,0);

        result.x = vector1.x - vector2.x;
        result.y = vector1.y - vector2.y;
        result.z = vector1.z - vector2.z;

        return result;
    } // разность векторов

    public static Vector[] randVector(int N) {
        Vector[] result = new Vector[N];

        for (int i = 0; i<result.length; i++){

            result[i] = new Vector(
                    (-50) + (int) (Math.random() * 100),
                    (-50) + (int) (Math.random() * 100),
                    (-50) + (int) (Math.random() * 100)
            );
        } // метод, возвращающий массив случайных векторов

        return result;
    }
}
