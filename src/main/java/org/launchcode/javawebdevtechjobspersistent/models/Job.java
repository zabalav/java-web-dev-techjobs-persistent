package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    private String name;

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private final List<Skill> skills = new ArrayList<Skill>();

    public Job() {}

    public Job(String aName, Employer anEmployer) {
        super();
        this.name = aName;
        this.employer = anEmployer;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

    public void setSkills(List<Skill> skillObjs) {
    }
}
