package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job jobA;
    Job jobB;

    @Before
    public void setUp() {
        jobA = new Job("Front-End Developer", new Employer("LaunchCode"), new Location("Charlotte"), new PositionType("Full Time"), new CoreCompetency("JavaScript"));
        jobB = new Job("Back-End Developer", new Employer("Apple"), new Location("Charlotte"), new PositionType("Full Time"), new CoreCompetency("Java"));
    }


    @Test
    public void testSettingJobId() {
        assertNotEquals(jobA.getId(), jobB.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job.getName() instanceof String);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);

        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job jobC = new Job("Front-End Developer", new Employer("LaunchCode"), new Location("Charlotte"), new PositionType("Full Time"), new CoreCompetency("JavaScript"));
        Job jobD = new Job("Front-End Developer", new Employer("LaunchCode"), new Location("Charlotte"), new PositionType("Full Time"), new CoreCompetency("JavaScript"));
        assertFalse(jobC.equals(jobD));
    }
}
