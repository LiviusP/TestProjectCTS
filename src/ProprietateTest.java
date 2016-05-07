import junit.framework.TestCase;
import main.Garsoniera;
import main.IImobil;
import main.Proprietate;

/**
 * Created by Livius on 5/7/2016.
 */
public class ProprietateTest extends TestCase {
    public void testAdaugaParcare() throws Exception {

        int pret = 40;
        IImobil imobilTest = new Garsoniera("test" , 20 , pret);
        Proprietate proprietate = new Proprietate(imobilTest);
        proprietate.adaugaParcare();
        assertEquals(pret+5000 , imobilTest.getSuma());
    }



}