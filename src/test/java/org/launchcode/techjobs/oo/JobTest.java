package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.naming.Name;

import static org.junit.Assert.*;

public class JobTest {
    Job job1 =  new Job("Developer",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));
    Job job2 =  new Job("Instructor",
            new Employer("ACME"),
            new Location("Desert"),
            new PositionType("Quality control"),
            new CoreCompetency("Persistence"));

    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());

    }
    @Test
    public void testJobConstructorSetsAllFields() {
    Job job1 =  new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
    assertTrue(job1.getName() instanceof String);
    assertTrue(job1.getEmployer() instanceof Employer);
    assertTrue(job1.getLocation() instanceof Location);
    assertTrue(job1.getPositionType() instanceof PositionType);
    assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
    assertEquals("Product tester",job1.getName());
    assertEquals("ACME",job1.getEmployer().getValue());
    assertEquals("Desert",job1.getLocation().getValue());
    assertEquals("Quality control",job1.getPositionType().getValue());
    assertEquals("Persistence",job1.getCoreCompetency().getValue());

    }
    @Test
    public void testJobsForEquality() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertFalse(job1.equals(job2));
    }
@Test
    public void testToStringStartsAndEndsWithNewLine() {
String expected = job1.toString();
assertTrue(expected.startsWith(System.lineSeparator()));
assertTrue(expected.endsWith(System.lineSeparator()));
    //System.out.println(job1.toString() + job2.toString());
}
@Test
    public void testToStringContainsCorrectLabelsAndData () {
        String expected = System.lineSeparator()+"ID: " + job1.getId()+ System.lineSeparator()+
                "Name: " + job1.getName()+System.lineSeparator()+
                "Employer: " + job1.getEmployer()+System.lineSeparator()+
                "Location: " + job1.getLocation()+System.lineSeparator()+
                "Position Type: " + job1.getPositionType()+System.lineSeparator()+
                "Core Competency: " + job1.getCoreCompetency()+System.lineSeparator();
        String output = job1.toString();
    System.out.println(expected);
    System.out.println(output);
    //System.out.println(job1.toString());
    assertEquals(expected,output);
}
@Test
    public void testToStringHandlesEmptyField() {
        Job job3 = new Job("",
            new Employer("ACME"),
            new Location(""),
            new PositionType("Quality control"),
            new CoreCompetency(""));;
    String expected = System.lineSeparator()+"ID: " + job3.getId()+ System.lineSeparator()+
            "Name: Data not available"+System.lineSeparator()+
            "Employer: " + job3.getEmployer()+System.lineSeparator()+
            "Location: Data not available"+System.lineSeparator()+
            "Position Type: " + job3.getPositionType()+System.lineSeparator()+
            "Core Competency: Data not available"+System.lineSeparator();
assertEquals(expected, job3.toString());
}

}


