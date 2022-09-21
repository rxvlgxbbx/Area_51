import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        int q = 5;
        System.out.println("2 задание - " + q);

        int w = 1;
        w++;
        w += 1;
        System.out.println("3 задание - " + w);

        int e = 2;
        int r = 5;
        int t = 0;

        t = r;
        r = e;
        e = t;

        e = e + r;
        r = e - r;
        e = e - r;
        System.out.println("4 задание - " + e + ", " + r);

        int s = 4;
        int v = 5;
        System.out.println("5 задание - " + Math.sqrt(s*s + v*v));

        System.out.println("6 задание - " + 14%10);

        System.out.println("7 задание - " + 90/10%10);

        System.out.println("8 задание - " + 20%100/10);

        int x = 200;
        System.out.println("9 задание - " + (x - 21));

        int y = 5;
        int z = 10;
        System.out.println("10 задание - " + ((y + z)/2));

        int a = 2;
        int b = 32;
        System.out.println("11 задание - " + (Math.sqrt(a * b)));

        double xx = 1.6;
        double yy = 7.4;
        double xxx = 4.5;
        double yyy = 10.3;
        System.out.println("12 задание - " + (Math.sqrt((xxx - xx)*(xxx - xx) + (yyy - yy) * (yyy - yy))));

        Matrix matrix1 = new Matrix(new int[][] {{1,5,6}, {4,5,2}, {1,6,3}}); // создание матрицы
        Matrix matrix2 = new Matrix(new int[][] {{3,2,3}, {3,5,3}, {3,6,3}});

        System.out.println("Сумма матриц - " + matrix1.sumMatrix(matrix1,matrix2).toString());
        System.out.println("Разность матриц - " + matrix1.differenceMatrix(matrix1,matrix2).toString());
        System.out.println("Умножение матрицы на число - " + matrix1.multiplicationMatrix(matrix1, 7).toString());
        System.out.println("Умножение матриц - " + matrix1.multiMatrices(matrix1,matrix1));
        System.out.println("Транспонированная матрица - " + matrix1.transposeMatrix(matrix1));
        System.out.println("Возведение матрицы в степень - " + matrix2.expMatrix(matrix1, 3));

        Vector vector1 = new Vector(1, 2, 3); // создание вектора
        Vector vector2 = new Vector(3, 4, 5);

        System.out.println("Длина вектора - " + vector1.lengthVector(vector1));
        System.out.println("Скалярное произведение векторов - " + vector1.scalarVectors(vector1, vector2));
        System.out.println("Векторное произведение - " + vector1.multiVector(vector1, vector2));
        System.out.println("Угол между векторами - " + vector1.angleVector(vector1, vector2));
        System.out.println("Сумма векторов - " + vector1.sumVector(vector1, vector2));
        System.out.println("Разность векторов - " + vector1.diffVector(vector1, vector2));
        System.out.println("Случайный массив векторов - " + Arrays.deepToString(Vector.randVector(2)));



        Box box1 = new Box(700); // объявление объема коробки
        Pyramid pyramid1 = new Pyramid(2, 3); // объявление объема пирамиды
        Ball ball1 = new Ball(4.5);
        Cylinder cylinder1 = new Cylinder(4, 3);

        System.out.println(box1.add(pyramid1)); // добавление фигуры в коробку
        System.out.println(box1.add(cylinder1));
        System.out.println(box1.add(ball1));

        Array massive = new Array(new int[] {1, 2, 3}, new int[] {10, 8, 6}); // объявление массива значений и массива весов

        System.out.println(massive.returnValue(massive));
    }
}