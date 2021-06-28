package com.example.groupproject;

import javax.persistence.*;

@Entity
@Table(name="projectResource")
public class ProjectResource {

    // define our fields

    // define constructors

    // define getter setters

    // define tostring

    // annotate fields

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="projectResourceID")
    private int projectResourceID;

    @Column(name="projectResourcename")
    private String projectResourcename;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(name = "projectID"),
            @JoinColumn(name = "resourceID")
    })





    private Project project;
    private Resource resource;

    public ProjectResource() {

    }

    public int getProjectResourceID() {
        return projectResourceID;
    }

    public String getProjectResourcename() {
        return projectResourcename;
    }

    public void setProjectResourceID(int projectResourceID) {
        this.projectResourceID = projectResourceID;
    }

    public void setProjectResourcename(String projectResourcename) {
        this.projectResourcename = projectResourcename;
    }
    //FK?
    public Project getProject(){
        return project;
    }
    public void setProject(Project project){
        this.project= project;
    }

    public Resource getResource(){
        return resource;
    }

    public void setResource(){
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "projectResourcename is " + projectResourcename;
    }


}