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
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if (x == y) {
                    values[x][y] = 1;
                } else {
                    values[x][y] = 0;
                }
            }
        }
    }

    @Override
    public double Determinant() {
        return 0;
    }

    @Override
    public double GetMatrixValue(int row, int column) throws InvalidDimensionException {
        checkIfOutOfBounds(column, row);
        return values[column][row];
    }

    @Override
    public void setMatrixValue(int row, int column, double value) throws InvalidDimensionException {
        checkIfOutOfBounds(column, row);
        values[column][row] = value;
    }

    @Override
    public void setMatrixValues(double[][] values) {
        
    }

    @Override
    public int getMatrixWidth() {
        return width;
    }

    @Override
    public int getMatrixHeight() {
        return height;
    }

    private void checkIfOutOfBounds(int x, int y) throws InvalidDimensionException {
        if (x < 0 || x > width || y < 0 || y > height) {
            throw new InvalidDimensionException();
        }
    }
}
