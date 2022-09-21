import java.util.Arrays;

public class Matrix {
    int[][] matrix;

    public String toString() {
        return Arrays.deepToString(matrix);
    } // метод, возвращающий объект в виде строки

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    } // конструктор матрицы

    public Matrix sumMatrix(Matrix matrixA, Matrix matrixB){
        Matrix result = new Matrix(new int[matrix.length][matrix[0].length]);
        try {
            for (int i = 0; i < matrixA.matrix.length; i++) { // обход матрицы циклом
                for (int j = 0; j < matrixA.matrix[i].length; j++) {
                    result.matrix[i][j] = matrixA.matrix[i][j] + matrixB.matrix[i][j]; // сложение элементов матрицы
                    if (matrixA.matrix[i].length != matrixB.matrix[j].length) { // проверяет количество элементов матрицы
                        System.out.println("Матрица разных размеров, сложение невозможно!");
                        System.exit(0);
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) { // проверяет размерность матрицы
            System.out.println("Матрицы разных размеров, сложение невозможно!");
            System.exit(0);
        }
        return result; // сумма матриц
    }


    public Matrix differenceMatrix(Matrix matrixA, Matrix matrixB) {
        Matrix result = new Matrix(new int[matrix.length][matrix[0].length]);
        try {
            for (int i = 0; i < matrixA.matrix.length; i++) {
                for (int j = 0; j < matrixA.matrix[i].length; j++) {
                    result.matrix[i][j] = matrixA.matrix[i][j] - matrixB.matrix[i][j];
                    if (matrixA.matrix[i].length != matrixB.matrix[j].length) {
                        System.out.println("Матрица разных размеров, вычитание невозможно!");
                        System.exit(0);
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Матрицы разных размеров, вычитание невозможно!");
            System.exit(0);
        }
        return result; // разность матриц
    }

    public Matrix multiplicationMatrix(Matrix matrixA, int num){
        Matrix result = new Matrix(new int[matrix.length][matrix[0].length]);
        for (int i = 0; i < matrixA.matrix.length; i++) {
            for (int j = 0; j < matrixA.matrix[i].length; j++) {
                result.matrix[i][j] = matrixA.matrix[i][j] * num;
            }
        }
        return result; // умножение матрицы на число
    }

    public Matrix multiMatrices(Matrix matrixA, Matrix matrixB){
        Matrix result = new Matrix(new int[matrix.length][matrixB.matrix[0].length]);
        try {
            for (int i = 0; i < matrixA.matrix.length; i++) { // обход элементов матрицы циклом
                for (int j = 0; j < matrixB.matrix[0].length; j++) {
                    for (int k = 0; k < matrixB.matrix.length; k++) {
                        result.matrix[i][j] += matrixA.matrix[i][k] * matrixB.matrix[k][j];
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) { // проверка матриц на возможность умножения
            System.out.println("Такие матрицы нельзя перемножить, " +
                    "так как количество столбцов матрицы А не равно количеству строк матрицы В");
            System.exit(0);
        }
        return result; // умножение матриц
    }

    public Matrix transposeMatrix(Matrix matrixA){
        try { // проверяет является ли матрица типа 2x2, 3x3, 4x4 и т.д.
            Matrix result = new Matrix(new int[matrix.length][matrix.length]);
            for (int i = 0; i < matrixA.matrix.length; i++) {
                for (int j = 0; j < matrixA.matrix.length; j++) {
                    result.matrix[i][j] = matrixA.matrix[j][i];
                }
            }
            return result;
        } catch (ArrayIndexOutOfBoundsException e) { // если матрица размеров 2x3, 3x2 и т.д.
            Matrix result = new Matrix(new int[matrixA.matrix[0].length][matrixA.matrix.length]);
            for(int i=0; i<matrixA.matrix[0].length; i++){
                for(int j=0; j<matrixA.matrix.length; j++){
                    result.matrix[i][j] = matrixA.matrix[j][i];
                }
            }
            return result; // транспонированная матрица
        }
    }

    public Matrix expMatrix(Matrix matrixA, int num){
        Matrix result = matrixA;
        int count = 1;
        while (count < num){
            result = multiMatrices(matrixA, result);
            count += 1;
        }
        return result; // возведение матрицы в степень
    }
}
