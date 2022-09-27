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

    // creates a new job id
    public Job() {
        this.id = nextId;
        nextId++;
    }

    // initializing Job fields
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // uses ternaries to return all job fields
    @Override
    public String toString() {
        return "\nID: " + id + "\n" +
                "Name: " + (name != null && !name.isEmpty() ? name : "Data not available") + "\n" +
                "Employer: " + (employer != null && !employer.toString().isEmpty() ? employer : "Data not available") + "\n" +
                "Location: " + (location != null && !location.toString().isEmpty() ? location : "Data not available") + "\n" +
                "Position Type: " + (positionType != null && !positionType.toString().isEmpty()? positionType : "Data not available") + "\n" +
                "Core Competency: " + (coreCompetency != null && !coreCompetency.toString().isEmpty() ? coreCompetency : "Data not available") + "\n";
    }

    // checks for job equality
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
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
}
