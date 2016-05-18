import junit.framework.TestCase;
import main.Apartament;
import main.IImobil;

/**
 * Created by Livius on 5/17/2016.
 */
public class ApartamentTest extends TestCase {

    IImobil apartament;

    @Override
    protected void setUp() throws Exception {
        this.apartament = new Apartament("test",30,20);
    }

    public void testGetInfo() throws Exception {

        assertNotNull(apartament);
        assertNotNull(apartament.getInfo());
        assertTrue(apartament.getInfo() instanceof String);

    }

    public void testGetSuma() throws Exception {
        assertEquals(20,apartament.getSuma());
    }

    public void testSetPret() throws Exception {
        apartament.setPret(50);
        assertEquals(50,apartament.getSuma());
    }

}