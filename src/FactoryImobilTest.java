import junit.framework.TestCase;
import main.FactoryImobil;
import main.Garsoniera;
import main.IImobil;

/**
 * Created by Livius on 5/7/2016.
 */
public class FactoryImobilTest extends TestCase {
    public void testGetImobil() throws Exception {

        FactoryImobil factoryImobil = new FactoryImobil();
        IImobil garsoniera1 = factoryImobil.getImobil("garsoniera" , "test" , 30 , 30);

        assertTrue(garsoniera1 instanceof Garsoniera);

    }

}