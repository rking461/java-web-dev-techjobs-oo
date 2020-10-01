package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTests {

    private Job one;
    private Job two;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    @Before
    public void createJobObject() {
        one = new Job();
        two = new Job();
        employer = new Employer("ACME");
        location = new Location("Desert");
        positionType = new PositionType("Quality control");
        coreCompetency = new CoreCompetency("Persistence");

    }

    @Test
    public void testSettingJobId() {

        assertEquals(1,one.getId());
        assertEquals(2,two.getId());
    }
    @Test
    public void testJobConstructorSetsAllFields(){

        one = new Job("Product tester", employer, location, positionType, coreCompetency);

       assertEquals("Product tester", one.getName());
       assertTrue("Set Employer", one.getEmployer() instanceof Employer);
       assertEquals("ACME", one.getEmployer().getValue());
       assertTrue("Set Location", one.getLocation() instanceof Location);
       assertEquals("Desert", one.getLocation().getValue());
       assertTrue("Set Position Type", one.getPositionType() instanceof PositionType);
       assertEquals("Quality control", one.getPositionType().getValue());
       assertTrue("Set Core Competency", one.getCoreCompetency() instanceof CoreCompetency);
       assertEquals("Persistence", one.getCoreCompetency().getValue());
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
//    @Test
//    public void testToStringMethodForCorrectLables(){
//        Employer acme = new Employer("ACME");
//        Location desert = new Location("Desert");
//        PositionType quality_control = new PositionType("Quality control");
//        CoreCompetency persistence = new CoreCompetency("Persistence");
//
//        Job productTester = new Job("Product tester", acme, desert, quality_control, persistence);
//        Job one = new Job();
//        System.out.println(one);


    //}


}
