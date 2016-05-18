import junit.framework.TestCase;
import main.ClientBuilder;

/**
 * Created by Livius on 5/18/2016.
 */
public class ClientBuilderTest extends TestCase {
    ClientBuilder builder;

    public void setUp() throws Exception {
        this.builder = new ClientBuilder();
    }

    public void testNume() throws Exception {
        assertEquals("test" , this.builder.Nume("test").build().getNume());
    }

    public void testAdresa() throws Exception {
        assertEquals("test" , this.builder.Adresa("test").build().getAdresa());

    }

    public void testTelefon() throws Exception {
        assertEquals("test" , this.builder.Telefon("test").build().getNrTelefon());
    }

    public void testBuild() throws Exception {
        assertNotNull(this.builder.build());
    }

}