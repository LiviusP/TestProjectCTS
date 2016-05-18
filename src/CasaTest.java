import junit.framework.TestCase;
import main.Apartament;
import main.Casa;
import main.IImobil;

/**
 * Created by Livius on 5/18/2016.
 */
public class CasaTest extends TestCase {
    IImobil casa;

    @Override
    protected void setUp() throws Exception {
        this.casa = new Casa("test",30,20);
    }

    public void testGetInfo() throws Exception {

        assertNotNull(casa);
        assertNotNull(casa.getInfo());
        assertTrue(casa.getInfo() instanceof String);
        assertTrue(casa.getInfo().contains("test"));

    }

    public void testGetSuma() throws Exception {
        assertEquals(20,casa.getSuma());
    }

    public void testSetPret() throws Exception {
        casa.setPret(50);
        assertEquals(50,casa.getSuma());
    }


}