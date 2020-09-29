package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTests {

    @Before
    public void createJobObject() {
        //Job[] jobObj = new Job[5];
        Job one = new Job();
        Job two = new Job();
    }

    @Test
    public void testSettingJobId() {

        Job one = new Job();
        Job two = new Job();
        assertEquals(3,one.getId());
        assertEquals(4,two.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Job productTester = new Job("Product tester", employer, location, positionType, coreCompetency);

       assertEquals("Product tester", productTester.getName());
       assertTrue("Set Employer", productTester.getEmployer() instanceof Employer);
       assertEquals("ACME", productTester.getEmployer().getValue());
       assertTrue("Set Location", productTester.getLocation() instanceof Location);
       assertEquals("Desert", productTester.getLocation().getValue());
       assertTrue("Set Position Type", productTester.getPositionType() instanceof PositionType);
       assertEquals("Quality control", productTester.getPositionType().getValue());
       assertTrue("Set Core Competency", productTester.getCoreCompetency() instanceof CoreCompetency);
       assertEquals("Persistence", productTester.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality(){
        Employer acme = new Employer("ACME");
        Location desert = new Location("Desert");
        PositionType quality_control = new PositionType("Quality control");
        CoreCompetency persistence = new CoreCompetency("Persistence");

        Job productTester = new Job("Product tester", acme, desert, quality_control, persistence);
        Job productTester2 = new Job("Product tester", acme, desert, quality_control, persistence);
        assertFalse("Must have different Ids", productTester.equals(productTester2));
    }

}
