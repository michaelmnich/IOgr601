import junit.framework.Assert;
import org.junit.Test;


public class MatrixMathTest {
    @Test
    public void testInverseMatrix(){}

    @Test
    public void testMatrixAddition(){
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
        IMatrix macierz3=new Matrix();

        try {
            macierz3=TEST.MatrixAddition(macierz1,macierz2);
        } catch (Exception e) {org.junit.Assert.fail();
        }

        for(int a=0;a<3;a++)
            for(int b=0;b<3;b++){
                try { Assert.assertEquals(macierz3.GetMatrixValue(a,b),(double)2*a);
                } catch (Exception e) {org.junit.Assert.fail(); }
            }


    }

    @Test
    public void testMatrixMultiplication(){}

    @Test
    public void testMatrixSubtracting(){
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
        IMatrix macierz3=new Matrix();

        try {
            macierz3=TEST.MatrixSubtracting(macierz1,macierz2);
        } catch (Exception e) {org.junit.Assert.fail();
        }

        for(int a=0;a<3;a++)
            for(int b=0;b<3;b++){
                try { Assert.assertEquals(macierz3.GetMatrixValue(a,b),(double)2*b);
                } catch (Exception e) {org.junit.Assert.fail(); }
            }


    }

    @Test
    public void testMatrixTransposition(){}

    @Test
    public void testScalarMultiplication(){}

}

