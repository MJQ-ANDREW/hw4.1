package mirea.javaLessons.practical41.ohshitherewegoagain;

public class Main {
    static public void main(String[] args) {
        double[][] arr = {{3.0, -1.0, 2.0}, {4, 2, 0}, {-5, 6, 1}};
        Matrix mtx = new Matrix(arr);
        double[][] arr2 = {{8, 1}, {7, 2}, {2, -3}};
        mtx.MyltiplyingMatrixByMatrix(arr2);
        mtx.PrintMatrix();
    }
}
