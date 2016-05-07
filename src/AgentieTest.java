import junit.framework.TestCase;
import main.Agentie;
import main.Client;
import main.Garsoniera;

/**
 * Created by Livius on 5/7/2016.
 */
public class AgentieTest extends TestCase {
    public void testGetImobil() throws Exception {

        assertEquals(null, Agentie.getInstance().getImobil(1));
    }

    public void testGetInstance() throws Exception {

        Agentie agentie = null;
        agentie = Agentie.getInstance();
        assertNotNull(agentie);
    }

    public void testGetName() throws Exception {
        assertEquals("Imobiliare",Agentie.getInstance().getName());
    }

    public void testAdaugaClient() throws Exception {

        Agentie agentie = Agentie.getInstance();
        int nrInitial = agentie.getNrClienti();
        agentie.adaugaClient(new Client("test","test","test"));
        assertEquals(nrInitial + 1 , agentie.getNrClienti());

    }

    public void testAdaugaImobil() throws Exception {
        Agentie agentie = Agentie.getInstance();
        int nrInitial = agentie.getNrImobile();
        agentie.adaugaImobil(new Garsoniera("test",23,33));
        assertEquals(nrInitial + 1 , agentie.getNrImobile());
    }


}