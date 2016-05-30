/**
 * Created by z1091308 on 2016-05-30.
 */
public interface IMatrix {

    void CreatIdentityMatrix(int size);
    double Determinant();
    double GetMatrixValue(int row, int column) throws InvalidDimensionException;
    void setMatrixValue(int row, int column, double value) throws InvalidDimensionException;
    void setMatrixValues(double[][] values);
    int getMatrixWidth();
    int getMatrixHeight();
}
