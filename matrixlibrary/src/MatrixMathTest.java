import junit.framework.Assert;
import org.junit.Test;


public class MatrixMathTest {
    @Test
    void testInverseMatrix(){}

    @Test
    void testMatrixAddition(){
        Matrix macierz1=new Matrix();
        Matrix macierz2=new Matrix();
        double tablica1[][]=new double[3][3];
        double tablica2[][]=new double[3][3];

        for(int a=0;a<3;a++)
            for(int b=0;b<3;b++){
                tablica1[a][b]=a+b;
                tablica2[a][b]=a-b;
            }
        macierz1.setMatrixValues(tablica1);
        macierz2.setMatrixValues(tablica2);
        MatrixMath TEST=new MatrixMath();



    }

    @Test
    void testMatrixMultiplication(){}

    @Test
    void testMatrixSubtracting(){}

    @Test
    void testMatrixTransposition(){}

    @Test
    void testScalarMultiplication(){}

}

