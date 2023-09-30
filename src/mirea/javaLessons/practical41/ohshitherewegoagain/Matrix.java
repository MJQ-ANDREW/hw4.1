package mirea.javaLessons.practical41.ohshitherewegoagain;

public class Matrix {
    private int numberLines;
    private int numberColums;
    private double[][] matrix;

    public Matrix(double[][] mtx) {
        this.matrix = new double[mtx.length][mtx[0].length];
        this.numberLines = mtx.length;
        this.numberColums = mtx[0].length;
        for (int i = 0; i < this.numberLines; i++) {
            for (int j = 0; j < this.numberColums; j++) {
                this.matrix[i][j] = mtx[i][j];
            }
        }
    }

    public void PrintMatrix() {
        for (int i = 0; i < this.numberLines; i++) {
            for (int j = 0; j < this.numberColums; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void AdditionMatrix(double[][] otherMatrix) {
        if (this.numberLines != otherMatrix.length || this.numberColums != otherMatrix[0].length) {
            System.out.println("Cannot perform addition");
            return;
        }
        for (int i = 0; i < this.numberLines; i++) {
            for (int j = 0; j < this.numberColums; j++) {
                this.matrix[i][j] += otherMatrix[i][j];
            }
        }
    }

    public void MyltiplyingMatrixByNumber(double num) {
        for (int i = 0; i < this.numberLines; i++) {
            for (int j = 0; j < this.numberColums; j++) {
                this.matrix[i][j] *= num;
            }
        }
    }

    public void MyltiplyingMatrixByMatrix(double[][] otherMatrix) {
        if (this.numberColums != otherMatrix.length) {
            System.out.println("Cannot perform myltiplying");
            return;
        }
        double[][] resMatrix = new double[this.numberLines][otherMatrix[0].length];
        double resValue = 0;
        for (int i = 0; i < this.numberLines; i++) {
            for (int j = 0; j < otherMatrix[0].length; j++) {
                for (int t = 0; t < this.numberColums; t++) {
                    resValue += this.matrix[i][t] * otherMatrix[t][j];
                }
                resMatrix[i][j] = resValue;
                resValue = 0;
            }
        }
        this.matrix = resMatrix;
        this.numberLines = resMatrix.length;
        this.numberColums = resMatrix[0].length;
    }
}
