import org.junit.Test;

public class MatrixTest {


    @Test
    public void testCreatIdentityMatrix() {
        Matrix macierz = new Matrix();
        macierz.CreatIdentityMatrix(5);
        Assert.assertEquals(5,macierz.getMatrixWidth(),getMatrixHeight());
        for(int a=0;a<5;a++)
            for(int b=0;b<5;b++){
                if(b==a) Assert.assertEquals(1,macierz.GetMatrixValue(a,b));
                else Assert.assertEquals(0,macierz.GetMatrixValue(a,b));

            }
    }

    @Test
    public void testDeterminant(){}

    @Test
    public void testGetMatrixValue (){}

    @Test
    public void testsetMatrixValue (){}

    @Test
    public void testsetMatrixValues (){}

}
