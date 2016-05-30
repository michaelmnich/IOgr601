/**
 * Created by z1091308 on 2016-05-30.
 */
public interface IMatrixMath {

    IMatrix InverseMatrix(IMatrix m1);
    IMatrix MatrixAddition(IMatrix m1, IMatrix m2) throws InvalidDimensionException;
    IMatrix MatrixMultiplication(IMatrix m1, IMatrix m2) throws InvalidDimensionException;
    IMatrix MatrixSubtracting(IMatrix m1, IMatrix m2)throws InvalidDimensionException;
    IMatrix MatrixTransposition(IMatrix m1);
    IMatrix ScalarMultiplication(IMatrix m1, double scalar);
}
