import junit.framework.TestCase;
import main.*;
import org.junit.Test;

/**
 * Created by Livius on 5/7/2016.
 */
public class TestCaseAchizitie extends TestCase {

    Agentie agentie;
    AchizitieImobil achizitieImobil;

    @Override
    protected void setUp() throws Exception {

        this.agentie = Agentie.getInstance();
        agentie.adaugaImobil(new Garsoniera("test",23,32));
        achizitieImobil = new AchizitieImobil();
        achizitieImobil.setImobil(agentie.getImobil(0));
    }

    @Test
    public void testCreditPay() throws Exception {
        achizitieImobil.setPlata(new PlataCredit());
        assertTrue(achizitieImobil.achitare().contains("credit"));
    }

}
