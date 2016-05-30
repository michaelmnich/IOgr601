/**
 * Created by z1091308 on 2016-05-30.
 */
public class Matrix implements IMatrix {

    private double values[][];
    private int width, height;

    @Override
    public void CreatIdentityMatrix(int size) {
        width = size;
        height = size;
        values = new double[size][size];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (x == y) {
                    values[y][x] = 1.0;
                } else {
                    values[y][x] = 0.0;
                }
            }
        }
    }

    @Override
    public double Determinant() throws InvalidDimensionException {
        if (width != height || width == 0) {
            throw new InvalidDimensionException();
        }

        if (width == 1) {
            return values[0][0];
        } else if (width == 2) {
            return getTwoByTwoDeterminant();
        } else if (width == 3) {
            return getThreeByThreeDeterminant();
        } else {
            throw new InvalidDimensionException("Too big matrix to calculate determinant.");
        }
    }

    @Override
    public double GetMatrixValue(int row, int column) throws InvalidDimensionException {
        checkIfOutOfBounds(row, column);
        return values[row][column];
    }

    @Override
    public void setMatrixValue(int row, int column, double value) throws InvalidDimensionException {
        checkIfOutOfBounds(row, column);
        values[row][column] = value;
    }

    @Override
    public void setMatrixValues(double[][] values) {
        if (values == null) {
            width = height = 0;
            this.values = null;
        } else {
            this.values = values;
            height = values.length;
            if (height != 0) {
                width = values[0].length;
            }
        }
    }

    @Override
    public int getMatrixWidth() {
        return width;
    }

    @Override
    public int getMatrixHeight() {
        return height;
    }

    private void checkIfOutOfBounds(int row, int column) throws InvalidDimensionException {
        if (row < 0 || row > height || column < 0 || column > width) {
            throw new InvalidDimensionException();
        }
    }

    private double getThreeByThreeDeterminant() {
        return values[0][0] * values[1][1] * values[2][2] +
                values[0][1] * values[1][2] * values[2][0] +
                values[0][2] * values[1][0] * values[2][1] -
                values[0][2] * values[1][1] * values[2][0] -
                values[0][1] * values[1][0] * values[2][2] -
                values[0][0] * values[1][2] * values[2][1];
    }

    private double getTwoByTwoDeterminant() {
        return values[0][0] * values[1][1] - (values[0][1] * values[1][0]);
    }
}
