import junit.framework.TestCase;
import main.Apartament;
import main.Garsoniera;
import main.IImobil;

/**
 * Created by Livius on 5/7/2016.
 */
public class GarsonieraTest extends TestCase {
    IImobil garsoniera;

    @Override
    protected void setUp() throws Exception {
        this.garsoniera = new Garsoniera("test",30,20);
    }

    public void testGetInfo() throws Exception {

        assertNotNull(garsoniera);
        assertNotNull(garsoniera.getInfo());
        assertTrue(garsoniera.getInfo() instanceof String);

    }

    public void testGetSuma() throws Exception {
        assertEquals(20,garsoniera.getSuma());
    }

    public void testSetPret() throws Exception {
        garsoniera.setPret(50);
        assertEquals(50,garsoniera.getSuma());
    }

}