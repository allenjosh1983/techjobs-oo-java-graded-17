package org.launchcode.techjobs.oo;

import java.util.Objects;



public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
public Job() {

    id = nextId++;

}
public Job(String name,Employer employer,Location location, PositionType positionType, CoreCompetency coreCompetency) {
    this();
    this.name = name;
    this.employer = employer;
    this.location = location;
    this.positionType = positionType;
    this.coreCompetency = coreCompetency;
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    //use setter to changes values to data not available if they are empty strings
    @Override
    public String toString(){
    String id = "ID: " + getId();
    String name = "Name: " +  (this.getName().isEmpty()? "Data not available" : this.getName());
    String employer = "Employer: " +  (this.getEmployer().getValue().isEmpty()? "Data not available" : this.getEmployer().getValue());
    String location = "Location: " +  (this.getLocation().getValue().isEmpty()? "Data not available" : this.getLocation().getValue());
    String positionType = "Position Type: " +  (this.getPositionType().getValue().isEmpty()? "Data not available" : this.getPositionType().getValue());
    String coreCompetency = "Core Competency: " +  (this.getCoreCompetency().getValue().isEmpty()? "Data not available" : this.getCoreCompetency().getValue());



    return System.lineSeparator() + id +System.lineSeparator() +
            name + System.lineSeparator()+
            employer +  System.lineSeparator()+
            location +  System.lineSeparator()+
            positionType +  System.lineSeparator()+
            coreCompetency + System.lineSeparator()
            ;
    }
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
