import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

/**
 * Created by Livius on 5/7/2016.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AgentieTest.class,
        FactoryImobilTest.class,
        GarsonieraTest.class,
        ProprietateTest.class,
        TestCaseAchizitie.class,
        ApartamentTest.class,
        CasaTest.class,
        ClientBuilderTest.class
})
public class TestSuite {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuite.class);
        System.out.println("Number of tests : " + result.getRunCount());
        for (Failure failure : result.getFailures()) {
            System.out.println("FAIL: " + failure.toString());
        }
        System.out.println("All test succesfull? " + result.wasSuccessful());
    }
}
