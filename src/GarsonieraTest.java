import junit.framework.TestCase;
import main.Garsoniera;
import main.IImobil;

/**
 * Created by Livius on 5/7/2016.
 */
public class GarsonieraTest extends TestCase {

    public void testSetPret() throws Exception {

        int pret = 40;
        IImobil garsonieraTest = new Garsoniera("test",34,pret);
        garsonieraTest.setPret(garsonieraTest.getSuma() + 10);
        assertEquals(pret + 10 , garsonieraTest.getSuma());
    }

}