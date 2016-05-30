/**
 * Created by z1091308 on 2016-05-30.
 */
public class MatrixMath implements IMatrixMath {

    @Override
    public IMatrix InverseMatrix(IMatrix m1) {
        return null;
    }

    @Override
    public IMatrix MatrixAddition(IMatrix m1, IMatrix m2) throws InvalidDimensionException {
        if (m1.getMatrixHeight() != m2.getMatrixHeight() || m1.getMatrixWidth() != m2.getMatrixWidth()) {
            throw new InvalidDimensionException();
        }

        double values[][] = new double[m1.getMatrixHeight()][m1.getMatrixWidth()];
        for (int y = 0; y < m1.getMatrixHeight(); y++) {
            for (int x = 0; x < m1.getMatrixWidth(); x++) {
                values[y][x] = m1.GetMatrixValue(y, x) + m2.GetMatrixValue(y, x);
            }
        }

        Matrix mtx = new Matrix();
        mtx.setMatrixValues(values);
        return mtx;
    }

    @Override
    public IMatrix MatrixMultiplication(IMatrix m1, IMatrix m2) throws InvalidDimensionException {
        return null;
    }

    @Override
    public IMatrix MatrixSubtracting(IMatrix m1, IMatrix m2) throws InvalidDimensionException {
        return null;
    }

    @Override
    public IMatrix MatrixTransposition(IMatrix m1) {
        return null;
    }

    @Override
    public IMatrix ScalarMultiplication(IMatrix m1, double scalar) {
        return null;
    }
}
