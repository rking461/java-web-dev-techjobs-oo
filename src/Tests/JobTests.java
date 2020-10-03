package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTests {

    private Job one;
    private Job two;
    private Job three;
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
        assertEquals(1, two.getId() - one.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        three = new Job("Product tester", employer, location, positionType, coreCompetency);

        assertEquals("Product tester", three.getName());
        assertTrue("Set Employer", three.getEmployer() instanceof Employer);
        assertEquals("ACME", three.getEmployer().getValue());
        assertTrue("Set Location", three.getLocation() instanceof Location);
        assertEquals("Desert", three.getLocation().getValue());
        assertTrue("Set Position Type", three.getPositionType() instanceof PositionType);
        assertEquals("Quality control", three.getPositionType().getValue());
        assertTrue("Set Core Competency", three.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", three.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        one = new Job("Product tester", employer, location, positionType, coreCompetency);
        two = new Job("Product tester", employer, location, positionType, coreCompetency);
        assertFalse("Must have different Ids", one.equals(two));
    }
    @Test
    public void testToStringMethodForCorrectLabels(){
        one = new Job("Product tester", employer, location, positionType, coreCompetency);
        String NL = System.getProperty("line.separator");
        String[] lines = one.toString().split(NL);

        assertEquals(lines[0], "ID: "+ one.getId());
        assertEquals(lines[1], "Name: "+ one.getName());
        assertEquals(lines[2], "Employer: "+ one.getEmployer());
        assertEquals(lines[3], "Location: "+ one.getLocation());
        assertEquals(lines[4], "Position Type: "+ one.getPositionType());
        assertEquals(lines[5], "Core Competency: "+ one.getCoreCompetency());
    }
}
