import junit.framework.Assert;
import org.junit.Test;

public class MatrixTest {


    @Test
    public void testCreatIdentityMatrix() {
        Matrix macierz = new Matrix();
        macierz.CreatIdentityMatrix(5);
        Assert.assertEquals(5,macierz.getMatrixWidth(),macierz.getMatrixHeight());
        for(int a=0;a<5;a++)
            for(int b=0;b<5;b++){
                if(b==a) {try {
                    Assert.assertEquals(1,macierz.GetMatrixValue(a,b));
                } catch (InvalidDimensionException e) {org.junit.Assert.fail();}
                }
                else try {
                    Assert.assertEquals(0,macierz.GetMatrixValue(a,b));
                } catch (InvalidDimensionException e) {org.junit.Assert.fail();}
                }


    }

    @Test
    public void testDeterminant(){
        Matrix macierz = new Matrix();
        double tablica[][]=new double[3][2];
        macierz.setMatrixValues(tablica);
        try{
            macierz.Determinant();
        }catch(Exception e){
            return;
        }
        Assert.fail();
    }

    @Test
    public void testDeterminant2(){
        Matrix macierz = new Matrix();
        double tablica[][]=new double[3][3];
        for(int a=0;a<3;a++)
            for(int b=0;b<3;b++)
                tablica[a][b]=2;
        macierz.setMatrixValues(tablica);
        try{
            Assert.assertEquals(macierz.Determinant(),0);
        }catch(Exception e){
            org.junit.Assert.fail();}
    }

    @Test
    public void testDeterminant3(){
        Matrix macierz = new Matrix();
        double tablica[][]=new double[2][2];
        for(int a=0;a<2;a++)
            for(int b=0;b<2;b++)
                tablica[a][b]=a+b;
        macierz.setMatrixValues(tablica);
        try{
            Assert.assertEquals(macierz.Determinant(),-1);
        }catch(Exception e){
            org.junit.Assert.fail();}
    }
    @Test
    public void testGetMatrixValue (){
        Matrix macierz = new Matrix();
        double tablica[][]=new double[3][3];
        for(int a=0;a<3;a++)
            for(int b=0;b<3;b++)
                tablica[a][b]=a+b;
        macierz.setMatrixValues(tablica);
        for(int a=0;a<3;a++)
            for(int b=0;b<3;b++)
                try {
                    Assert.assertEquals(macierz.GetMatrixValue(a,b),a+b);
                } catch (InvalidDimensionException e) {org.junit.Assert.fail(); }

        try {
            macierz.GetMatrixValue(2,3);
            org.junit.Assert.fail();
        } catch (InvalidDimensionException e) {}

        try {
            macierz.GetMatrixValue(3,3);
            org.junit.Assert.fail();
        } catch (InvalidDimensionException e) {}

        try {
            macierz.GetMatrixValue(3,2);
            org.junit.Assert.fail();
        } catch (InvalidDimensionException e) {}

    }


    @Test
    public void testsetMatrixValue (){}

    @Test
    public void testsetMatrixValues (){}

}
